import java.io.File;
import java.util.Scanner;
public class TiddyNumbers {
	
	public static void main(String[] args) throws Exception {
		
		Scanner input = new Scanner(new File("src/B-small-practice.in"));
		
		String str, n, T;
		T = input.nextLine();
		char digits[] = {'0','1','2','3','4','5','6','7','8','9'};
		int temp[] = new int[2];
		
		for(int tt = 1; tt <= Integer.parseInt(T); tt++){
			n = input.nextLine();
			str = n;
			char convert [] = str.toCharArray();
			boolean change = false;
			for(int i = 0; i < convert.length; i++){
				for(int ii = convert.length-1; ii >= 1; ii--){
					temp[0] = Character.getNumericValue(convert[ii]);
					temp[1] = Character.getNumericValue(convert[ii-1]);
					
					if (temp[1]>=temp[0]){
						convert[ii-1] = digits[Character.getNumericValue(convert[ii-1])-1];
						change = true;
						convert[ii] = '9';
					}
				}
			}
			for(int i = 0; i < convert.length; i++){
				System.out.print(convert[i]);
			}
			System.out.println();
		}
		input.close();
	}

}

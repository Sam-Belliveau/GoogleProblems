import java.io.File;
import java.util.Scanner;
public class TiddyNumbers {
	public static void main(String[] args) throws Exception {	
		Scanner input = new Scanner(new File("src/B-large-practice.in"));
		String str,  T;
		T = input.nextLine();
		char digits[] = {'0','1','2','3','4','5','6','7','8','9'};
		int temp[] = new int[2];
		for(int tt = 1; tt <= Integer.parseInt(T); tt++){
			str = input.nextLine();
			char convert [] = str.toCharArray();
			for(int i = 0; i < convert.length; i++){
				boolean carry = true;
				for(int ii = 0; ii < convert.length-1; ii++){
					temp[0] = Character.getNumericValue(convert[ii]);
					temp[1] = Character.getNumericValue(convert[ii+1]);
					if (temp[1]<temp[0]){ 
						convert[ii+1] = '9'; 
						if (carry){
							convert[ii] = digits[temp[0]-1];
							carry = false;
						}
					}
				}
			}
			System.out.print("Case #" + tt + ": ");
			if (convert[0] == '0'){
				for(int i = 1; i < convert.length; i++){
					System.out.print(convert[i]);
				}
			}
			else{
				for(int i = 0; i < convert.length; i++){
					System.out.print(convert[i]);
				}
			}
			System.out.println();
		}
		input.close();
	}
}

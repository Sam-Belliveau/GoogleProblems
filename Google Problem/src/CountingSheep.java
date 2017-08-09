import java.io.File;
import java.util.Scanner;
public class CountingSheep {

	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(new File("src/A-large-practice.in"));
		
		int t = input.nextInt();
		
		for(int i = 1; i < (t+1); i++){
			int num = input.nextInt();
				if (sheep(num) != 0){
					System.out.println("Case #" + i + ": " + sheep(num));
				} else{
					System.out.println("Case #" + i + ": INSOMNIA");
				}
		}
		input.close();
	}
	
	public static int sheep(int N){
		if(N == 0){
			return 0;
		}
		boolean list[] = new boolean[10];
		char digits[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		int i = 0;
		String temp;
		while(!(testList(list)))
		{
			i++;
			temp = Integer.toString(N*i);
			for (byte l = 0; l < 10; l++)
			{
				if (isInString(temp, digits[l]))
				{
					list[l] = true;
				}
			}
		}
		return N*i;
		
	}
	public static boolean testList(boolean list[]){
		for(byte i = 0; i < 10; i++){
			if (list[i] != true){
				return false;
			}
		}
		return true;
	}
	
	public static boolean isInString(String word, char let){	
		for(int i = 0; i < word.length(); i++){
			if(word.charAt(i) == let){
				return true;
			}
		}
		return false;
	}
}

import java.io.File;
import java.util.Scanner;

public class Magic {
	public static void main(String[] args) throws Exception{
		
		Scanner input = new Scanner(new File("src/small-practice.txt"));
		
		int T = input.nextInt();
		
		for(int i = 1; i<(T+1); i++){

			byte x1, x2;
			x1 = input.nextByte();
			
			byte row1[] = new byte[4];
			
			byte grid [] [] = new byte[4][4];
			
			for(byte k=0; k < grid.length; k++){
				for(int l = 0; l < grid[0].length; l++){
					grid[k][l] = input.nextByte();
					if ((x1-1) == k){
						row1[l] = grid[k][l];
					}
				}

			}
			
			x2 = input.nextByte();
			
			byte row2[] = new byte[4];
			
			for(byte k=0; k < grid.length; k++){
				for(byte l = 0; l < grid[0].length; l++){
					grid[k][l] = input.nextByte();
					if((x2-1) == k){
						row2[l] = grid[k][l];
					}
				}
			}
			
			byte counter = 0;
			byte numFound = 0;
			
			for(byte k = 0; k < row1.length; k++){
				for(byte l = 0; l < row2.length; l++){
					if (row1[k] == row2[l]){
						numFound = row1[k];
						counter++;
					}
				}
			}
			if (counter == 0){
				System.out.println("Case #" + i + ": Volunteer cheated!");
			} else if(counter == 1){
				System.out.println("Case #" + i + ": " + numFound);
			} else{
				System.out.println("Case #" + i + ": Bad Magician!");
			}
		}
		
		input.close();
	}
	public static double fac(double num){
		if(num<=1){
			return 1;
		}
		else{
			return (num*fac(num-1));
		}
	}
}

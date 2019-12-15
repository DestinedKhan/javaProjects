import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class day2 {
	
	
	
	
	public static void main(String args[]) {
		/*
		 * 1st Number = Add/Divide/Multiply
		 * 2nd Number = Position of number to use
		 * 3rd Number = Position of number to use
		 * 4th Number = Position to overwrite
		 * 
		 */
		File file = new File("needthis.txt");
		try {
			Scanner in = new Scanner(file);
			
			int a[] = new int[165];
			String s = in.nextLine();
			String [] plz = s.split(",");
			for(int x = 0;x<plz.length;x++) {
				/*
				 * fill array
				 */
				a[x]=Integer.parseInt(plz[x]);
			}
			
			
			for(int x= 0;x<=a.length;x+=4) {
				if(a[x]==1) {
				a[a[x+3]] = a[a[x+1]]+a[a[x+2]];
					
				}
				else if(a[x]==2) {
					
				a[a[x+3]] = (a[a[x+1]])*(a[a[x+2]]);	
				}
				else if(a[x]==99) {
					break;
					
				}
				else {
					break;
				}
			}
			System.out.println(a[0]);
			
			
			
		}catch(IOException e) {
			System.out.println("error");
		}
	}

}

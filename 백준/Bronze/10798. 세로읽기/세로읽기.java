import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] five = new String[5];
		int maxL=0;
		for(int i=0;i<5;i++) {
			five[i] = sc.nextLine();
			if(maxL<five[i].length()) maxL = five[i].length();
		}
		
		for(int i=0;i<maxL;i++) 
			for(int j=0;j<5;j++) 
				if(five[j].length()>i) System.out.print(five[j].charAt(i));
		sc.close();
	}
}
import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(),m=sc.nextInt();
		int[][] a = new int[n][m], b = new int[n][m];
		for(int i=0;i<n;i++) 
			for(int j=0;j<m;j++) 
				a[i][j] = sc.nextInt();
		for(int i=0;i<n;i++) 
			for(int j=0;j<m;j++) 
				b[i][j] = sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				System.out.print(a[i][j]+b[i][j]+" ");
			}
			System.out.println();
		}		
		sc.close();
	}
}
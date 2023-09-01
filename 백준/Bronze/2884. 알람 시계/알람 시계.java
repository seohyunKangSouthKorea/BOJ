import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt(), m = sc.nextInt();
		if(m<45 && h>0) {
			h-=1; 
			m+=(60-45);
		}
		else if(m<45 && h==0) {
			h=23; 
			m+=(60-45);
		}
		else m -= 45;
		System.out.printf("%d %d",h,m);
		sc.close();
	}	
}

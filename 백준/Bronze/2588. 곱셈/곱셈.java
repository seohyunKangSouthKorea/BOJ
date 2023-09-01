import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int fir=sc.nextInt(), sec=sc.nextInt(),cnt=3;
		int tmp = sec;
		while(true) {
			System.out.println(fir*(tmp%10));
			tmp = tmp/10;
			cnt--;
			if(cnt==0) break;
		}
		System.out.println(fir*sec);
		sc.close();
	}	
}

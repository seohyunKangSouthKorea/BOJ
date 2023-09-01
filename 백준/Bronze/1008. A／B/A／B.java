import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt(),b = sc.nextInt();
		String result = Double.toString((double)a/b);
		for(int i=0;i<result.length();i++) {
			if(result.charAt(i)=='0'&&i!=0) break;
			System.out.print(result.charAt(i));
		}
		sc.close();
	}	
}

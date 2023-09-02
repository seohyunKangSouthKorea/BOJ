import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		StringBuffer s = new StringBuffer(str);
		if(str.equals(s.reverse().toString())) System.out.print(1);
		else System.out.print(0);
		sc.close();
	}
}
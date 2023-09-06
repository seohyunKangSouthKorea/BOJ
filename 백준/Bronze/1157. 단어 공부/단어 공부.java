import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		StringBuffer s = new StringBuffer(str.toUpperCase());
		int max = 0,ch=0;
		char most=' ';
		int[] cnt = new int[26];
		for(int i=0;i<s.length();i++) {
			cnt[s.charAt(i)-65]++;
			if(cnt[s.charAt(i)-65]>max) max = cnt[s.charAt(i)-65];
		}
		
		for(int i=0;i<26;i++) {
			if(cnt[i]==max) {
				ch++;
				most = (char)(i+65);
			}
		}
		if(ch>1) System.out.print("?");
		else System.out.print(most);
		sc.close();
	}
}
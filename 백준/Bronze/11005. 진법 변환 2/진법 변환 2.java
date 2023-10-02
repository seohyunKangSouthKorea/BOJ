import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf =  new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int n = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
		Deque<Character> d = new ArrayDeque<>();
		while(true) {
			if(n%b>9) d.addFirst((char)(n%b+55));
			else d.addFirst((char)(n%b+48));
			if(n<b) break;
			n /= b;
		}
		for(char c:d) System.out.print(c);
		bf.close();
	}
}
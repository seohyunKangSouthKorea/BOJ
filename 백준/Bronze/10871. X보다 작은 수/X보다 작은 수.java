import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String tmp = bf.readLine();
		StringTokenizer st = new StringTokenizer(tmp);
		int n = Integer.parseInt(st.nextToken()), x = Integer.parseInt(st.nextToken());
		tmp = bf.readLine();
		st = new StringTokenizer(tmp);
		for(int i=0;i<n;i++) {
			int ch = Integer.parseInt(st.nextToken());
			if(x>ch) System.out.print(ch+" ");
		}
		bf.close();
	}
}
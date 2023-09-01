import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int cnt=0;
		while(st.hasMoreTokens()) {
			st.nextToken();
			cnt++;
		}
		bw.write(cnt+"");
		bw.flush();
		bw.close();
		bf.close();
	}
}
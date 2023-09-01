import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader bf =  new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String tmp = bf.readLine();
		int t = Integer.parseInt(tmp);
		for(int i=0;i<t;i++) {
			tmp = bf.readLine();
			StringTokenizer st = new StringTokenizer(tmp);
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			bw.write(a+b+"\n");
		}
		bw.flush();
		bw.close();
		bf.close();
	}
}
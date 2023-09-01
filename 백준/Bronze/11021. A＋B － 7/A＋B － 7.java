import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(bf.readLine()),a,b;
		for(int i=0;i<t;i++) {
			String tmp = bf.readLine();
			StringTokenizer st = new StringTokenizer(tmp);
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			bw.write("Case #"+(i+1)+": "+(a+b)+"\n");
		}
		bw.flush();
		bw.close();
		bf.close();
	}
}
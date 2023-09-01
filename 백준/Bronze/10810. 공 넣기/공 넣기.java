import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		int[] arr = new int[102];
		for(int i=0;i<m;i++) {
			String tmp = bf.readLine();
			st = new StringTokenizer(tmp);
			int fir = Integer.parseInt(st.nextToken()), sec = Integer.parseInt(st.nextToken()), thr = Integer.parseInt(st.nextToken());
			for(int j=fir;j<=sec;j++) arr[j] = thr;
		}
		for(int i=1;i<=n;i++) bw.write(arr[i]+" ");
		bw.flush();
		bw.close();
		bf.close();
	}
}

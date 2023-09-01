import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		int[] arr = new int[102];
		for(int i=1;i<=n;i++) arr[i] = i;
		for(int i=0;i<m;i++) {
			st = new StringTokenizer(bf.readLine());
			int c1 = Integer.parseInt(st.nextToken()), c2 = Integer.parseInt(st.nextToken());
			int tmp = arr[c1];
			arr[c1] = arr[c2];
			arr[c2] = tmp;
		}
		for(int i=1;i<=n;i++) bw.write(arr[i]+" ");
		bw.flush();
		bw.close();
		bf.close();
	}
}
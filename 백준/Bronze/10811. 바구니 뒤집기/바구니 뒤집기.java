import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] arr = new int[102];
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		for(int i=1;i<=n;i++) arr[i] = i;
		for(int i=0;i<m;i++) {
			st = new StringTokenizer(bf.readLine());
			int fir = Integer.parseInt(st.nextToken()), last = Integer.parseInt(st.nextToken());
			for(int j=fir;j<=(fir+last)/2;j++) {
				int tmp = arr[j];
				arr[j] = arr[last+fir-j];
				arr[last+fir-j] = tmp;
			}
		}
		for(int i=1;i<=n;i++) bw.write(arr[i]+" ");
		bw.flush();
		bw.close();
		bf.close();
	}
}

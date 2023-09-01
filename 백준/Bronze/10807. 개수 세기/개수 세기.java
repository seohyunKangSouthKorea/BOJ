import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine()),v,cnt=0;
		String tmp = bf.readLine();
		StringTokenizer st = new StringTokenizer(tmp);
		v = Integer.parseInt(bf.readLine());
		for(int i=0;i<n;i++) {
			if(v==Integer.parseInt(st.nextToken())) cnt++;
		}
		System.out.print(cnt);
		bf.close();
	}
}
import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String tmp = bf.readLine();
		int n = Integer.parseInt(tmp),min=1000001,max=-1000001;
		tmp = bf.readLine();
		StringTokenizer st = new StringTokenizer(tmp);
		for(int i=0;i<n;i++) {
			int ch = Integer.parseInt(st.nextToken());
			if(min>ch) min = ch;
			if(max<ch) max = ch;
		}
		bw.write(min+" "+max);
		bw.flush();
		bw.close();
		bf.close();
	}
}
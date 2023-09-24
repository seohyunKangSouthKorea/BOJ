import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		boolean[][] sqr = new boolean[101][101];
		int clrCnt = Integer.parseInt(bf.readLine()), cnt=0;
		for(int i=0;i<clrCnt;i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			int l = Integer.parseInt(st.nextToken()), r = Integer.parseInt(st.nextToken());
			for(int j=l;j<l+10;j++) 
				for(int k=r;k<r+10;k++) 
					if(!sqr[j][k]) sqr[j][k] = true;
		}
		for(int i=1;i<=100;i++) 
			for(int j=1;j<=100;j++) 
				if(sqr[i][j]) cnt++;
		System.out.print(cnt);
		bf.close();
	}
}
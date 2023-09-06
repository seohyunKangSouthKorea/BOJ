import java.io.*;

public class Main{
	static long pow(int b, int cnt) {
		cnt--;
		if(cnt==-1) return 1;
		return b * pow(b,cnt);
	}	
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    long cnt = 0;
		String[] nB = bf.readLine().split(" ");
		int b = Integer.parseInt(nB[1]);
		for(int i=0;i<nB[0].length();i++) {
			int tmp=0;
			if('0'<=nB[0].charAt(nB[0].length()-1-i)&&nB[0].charAt(nB[0].length()-1-i)<='9')
				tmp = nB[0].charAt(nB[0].length()-1-i)-48;
			else tmp = nB[0].charAt(nB[0].length()-1-i)-55;
			cnt += tmp*pow(b,i);
		}
		bw.write(cnt+"");
		bw.flush();
		bw.close();
		bf.close();
	}
}
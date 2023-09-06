import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String t = bf.readLine();
		int n = Integer.parseInt(t), cnt=0;
		for(int i=0;i<n;i++) {
			String tmp = bf.readLine();
			boolean[] al = new boolean[26];
			boolean ch=true;
			for(int j=0;j<tmp.length();j++) {
				if(!al[tmp.charAt(j)-97]) al[tmp.charAt(j)-97] = true;
				else {
					if(tmp.charAt(j)!=tmp.charAt(j-1)) {
						ch = false;
						break;
					}
				}
			}
			if(ch) cnt++;
		}
		bw.write(cnt+"");
		bw.flush();
		bw.close();
		bf.close();
	}
}
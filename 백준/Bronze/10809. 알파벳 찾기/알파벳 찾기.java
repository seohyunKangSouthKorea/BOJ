import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = bf.readLine();
		int[] alpha = new int[26];
		for(int i=0;i<26;i++) alpha[i] = -1;
		for(int i=0;i<s.length();i++) {
			if(alpha[s.charAt(i)-97]==-1) alpha[s.charAt(i)-97] = i;
		}
		for(int i=0;i<26;i++) bw.write(alpha[i]+" ");
		bw.flush();
		bw.close();
		bf.close();
	}
}
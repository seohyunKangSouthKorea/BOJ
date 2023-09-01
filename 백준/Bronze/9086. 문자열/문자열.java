import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(bf.readLine());
		for(int i=0;i<t;i++) {
			String tmp = bf.readLine();
			bw.write(""+tmp.charAt(0)+tmp.charAt(tmp.length()-1)+"\n"); // 맨앞에 "" 안써주면 아스키코드 출력됨
		}
		bw.flush();
		bw.close();
		bf.close();
	}
}
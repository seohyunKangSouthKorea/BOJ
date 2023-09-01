import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = bf.readLine();
		bw.write(s.charAt(Integer.parseInt(bf.readLine())-1));
		bw.flush();
		bw.close();
		bf.close();
	}
}
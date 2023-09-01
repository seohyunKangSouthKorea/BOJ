import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int ascii = bf.readLine().charAt(0);
		bw.write(ascii+"");
		bw.flush();
		bw.close();
		bf.close();
	}
}
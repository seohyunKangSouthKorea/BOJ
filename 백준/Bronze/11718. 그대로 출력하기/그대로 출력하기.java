import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String in = "";
		while((in = bf.readLine())!=null)	bw.write(in+"\n");
		bw.flush();
		bw.close();
		bf.close();
	}
}
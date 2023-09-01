import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String in="";
		while((in=bf.readLine())!=null) {
			String[] arr = in.split(" ");
			int a = Integer.parseInt(arr[0]);
			int b = Integer.parseInt(arr[1]);
			bw.write(a+b+"\n");
		}
		bw.flush();
		bw.close();
		bf.close();
	}
}
import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(bf.readLine()), sum=0;
		String tmp = bf.readLine();
		for(int i=0;i<n;i++) 
			sum += Integer.parseInt(tmp.charAt(i)+"");
		bw.write(sum+"");
		bw.flush();
		bw.close();
		bf.close();
	}
}
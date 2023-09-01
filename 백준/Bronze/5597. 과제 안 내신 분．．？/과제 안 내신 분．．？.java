import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] arr = new int[32];
		for(int i=0;i<28;i++) 
			arr[Integer.parseInt(bf.readLine())]++;
		for(int i=1;i<=30;i++)
			if(arr[i]==0) bw.write(i+"\n");
		bw.flush();
		bw.close();
		bf.close();
	}
}
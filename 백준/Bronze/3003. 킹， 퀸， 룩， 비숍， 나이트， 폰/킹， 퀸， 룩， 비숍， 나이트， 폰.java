import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] p = {1,1,2,2,2,8};
		String[] arr = bf.readLine().split(" ");
		for(int i=0;i<6;i++) 
			bw.write(p[i]-Integer.parseInt(arr[i])+" ");
		bw.flush();
		bw.close();
		bf.close();
	}
}
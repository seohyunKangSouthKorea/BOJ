import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] arr = new int[42];
		int cnt = 0;
		for(int i=0;i<10;i++) 
			arr[Integer.parseInt(bf.readLine())%42]++;
		for(int i=0;i<42;i++) 
			if(arr[i]>0) cnt++;
		bw.write(cnt+"");
		bw.flush();
		bw.close();
		bf.close();
	}
}

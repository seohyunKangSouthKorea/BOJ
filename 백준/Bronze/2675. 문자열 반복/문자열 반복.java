import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(bf.readLine());
		for(int i=0;i<t;i++) {
			String[] arr = bf.readLine().split(" ");
			int r = Integer.parseInt(arr[0]);
			for(int j=0;j<arr[1].length();j++) 
				for(int k=0;k<r;k++) 
					bw.write(arr[1].charAt(j)+"");
			bw.write("\n");
		}
		bw.flush();
		bw.close();
		bf.close();
	}
}
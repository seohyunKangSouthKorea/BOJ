import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] arr = bf.readLine().split(" ");
		StringBuffer sb = new StringBuffer(arr[0]),sb2 = new StringBuffer(arr[1]); // reverse()메소드는 스트링버퍼에 있음
		int a = Integer.parseInt(sb.reverse()+""), b = Integer.parseInt(sb2.reverse()+"");
		bw.write((a>b?a:b)+"");
		bw.flush();
		bw.close();
		bf.close();
	}
}
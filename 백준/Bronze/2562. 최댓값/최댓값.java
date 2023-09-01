import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int max = 0, idx = 1;
		for(int i=0;i<9;i++) {
			int ch = Integer.parseInt(bf.readLine());
			if(max < ch) {
				max = ch; 
				idx = i+1;	
			}
		}
		bw.write(max+"\n"+idx);
		bw.flush();
		bw.close();
		bf.close();
	}
}
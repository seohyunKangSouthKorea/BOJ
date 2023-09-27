import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		bf.close();
		for(int i=0;;i++) {
			if(1+6*(i*(i+1)/2)>=n) {
				System.out.print(i+1);
				break;
			}
		}
	}
}
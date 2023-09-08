import java.io.*;

public class Main{	
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] arr = new int[5];
		int sum = 0;
		for(int i=0;i<5;i++) {
			arr[i] = Integer.parseInt(bf.readLine());
			sum += arr[i];
		}
		for(int i=0;i<4;i++) {
			for(int j=0;j<4-i;j++) {
				if(arr[j] > arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
		bw.write(sum/5+"\n");
		bw.write(arr[2]+"");
		bw.flush();
		bw.close();
		bf.close();
	}
}
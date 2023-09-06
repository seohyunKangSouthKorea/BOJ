import java.io.*;

public class Main{	
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    int i=666;
		int n = Integer.parseInt(bf.readLine()),cnt=0;
	    for(;;) {
	    	if(Integer.toString(i).indexOf("666")!=-1) cnt++;
	    	if(cnt==n) {
	    		bw.write(i+""); 
	    		break;
	    	}
	    	i++;
	    }
		bw.flush();
		bw.close();
		bf.close();
	}
}
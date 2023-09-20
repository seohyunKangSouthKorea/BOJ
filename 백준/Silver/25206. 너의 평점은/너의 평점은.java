import java.io.*;

public class Main{
	static boolean ch;
	static double sum(double g, String strG) { 
		ch = true;
		switch(strG) {
			case "A+":
				return g*4.5;
			case "A0":
				return g*4.0;
			case "B+":
				return g*3.5;
			case "B0":
				return g*3.0;
			case "C+":
				return g*2.5;
			case "C0":
				return g*2.0;
			case "D+":
				return g*1.5;
			case "D0":
				return g*1.0;
			case "F":
				return g*0.0;
			default:
				ch = false;
				return 0.0;
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		double gS=0.0, gA=0.0, gG=0.0;
		for(int i=0;i<20;i++) {
			String s = bf.readLine();
			String[] str = s.split(" ");
			gG += sum(Double.parseDouble(str[1]),str[2]);
			if(ch) gS += Double.parseDouble(str[1]);
		}
		gA = gG/gS;
		bw.write(""+gA);
		bw.close();
		bf.close();
	}
}
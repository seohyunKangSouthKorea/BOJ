import java.io.*;
import java.util.*;
public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int[] abv = new int[3];
		StringTokenizer st = new StringTokenizer(bf.readLine());
		for(int i=0;i<3;i++) abv[i] = Integer.parseInt(st.nextToken());
		int a = abv[0], b = abv[1], v = abv[2], day=(v-b)/(a-b);
		if((v-b)%(a-b)!=0) day += 1;
		System.out.println(day);
		bf.close();
	}
}
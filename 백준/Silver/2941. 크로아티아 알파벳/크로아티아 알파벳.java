import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		StringBuilder s = new StringBuilder(str);
		String[] croatia = {"c=","c-","dz=","d-","lj","nj","s=","z="};
		int cnt = 0;
		for(int i=0;i<8;i++) {
			int fir = 0;
			while(fir<=s.length()-1) {
				fir = s.indexOf(croatia[i],fir);
				if(fir==-1) break;
				cnt++;
				if(croatia[i].equals("dz=")) s.replace(fir, fir+croatia[i].length(), "!!!");
				else s.replace(fir, fir+croatia[i].length(), "!!");
				fir = fir + croatia[i].length();
			}
		}
		String[] arr = s.toString().split("!");
		for(int i=0;i<arr.length;i++) 
			cnt += arr[i].length();
		System.out.print(cnt);
		sc.close();
	}
}
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h=sc.nextInt(),m=sc.nextInt(),nT=sc.nextInt(), nTM=0, nTH=0,rH=0,rM=0;
		nTH = nT/60;
		nTM = nT%60; 
		if(nTM + m>59) {
			rM = (nTM+m)-60;
			nTH += 1;
		}
		else rM = nTM + m;
		if(h + nTH>23) rH = (h+nTH)-23-1;
		else rH = h+nTH;
		System.out.printf("%d %d",rH,rM);
		sc.close();
	}	
}
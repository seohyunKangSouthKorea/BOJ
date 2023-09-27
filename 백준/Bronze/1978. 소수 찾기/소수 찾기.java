import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), max=0, cnt=0;
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
			if(max<arr[i]) max = arr[i];
		}
		boolean[] isYak = new boolean[max+1];
		isYak[1] = true;
		for(int i=2;i*i<=max;i++) {
			if(i%2==0&&i!=2) continue;
			for(int j=2;i*j<=max;j++) {
				if(!isYak[i*j]) isYak[i*j] = true;
			}
		}
		for(int i=0;i<n;i++) if(!isYak[arr[i]]) cnt++;
		System.out.print(cnt);
		sc.close();
	}
}


import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), max = -1;
		int[] arr = new int[1002];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
			if(arr[i]>max) max = arr[i];
		}
		double sum = 0.0;
		for(int i=0;i<n;i++) 
			sum += (double)arr[i]/max*100;
		System.out.print(sum/n);
		sc.close();
	}
}
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ch = new int[7];
		int tmp = 0, max=0;
		boolean sD = false;
		for(int i=0;i<3;i++) {
			tmp = sc.nextInt();
			ch[tmp]++;
		}
		for(int i=1;i<=6;i++) {
			if(ch[i]==3) {
				System.out.println(10000+i*1000);
				sD = true;
				break;
			}
			else if(ch[i]==2) {
				System.out.println(1000+i*100);
				sD = true;
				break;
			}
			else if(ch[i]==1) max = i;
		}
		if(!sD) System.out.println(max*100);
		sc.close();
	}	
}
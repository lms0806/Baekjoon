import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] num = new int[10];
		int temp = n;
		
		while(temp != 0) {
			int a = temp%10;
			if(a == 6 || a == 9) {
				num[9]++;
			}
			else {
				num[a]++;
			}
			temp/=10;
		}
		
		int nummax = 0;
		
		for(int i = 0; i < num.length-1; i++) {
			if(nummax <= num[i]) {
				nummax = num[i];
			}
		}
		
		int sixnine = 0;
		
		if(num[9] % 2 == 0) {
			sixnine = num[9] / 2;
		}
		else {
			sixnine = num[9] / 2 + 1;
		}
		
		int max = (int) Math.max(nummax, sixnine);
		if(n == 0) {
			max = 1;
		}
		
		System.out.println(max);
	}
}

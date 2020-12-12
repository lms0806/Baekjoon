import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] nums = new int[n];
		
		int m = 2;
		int min = 1;
		for(int i = 0; i < n; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			while(m<=a && m<=b) {
				if(a%m==0 && b%m==0) {
					min = m;
				}
				m++;
			}
			nums[i] = a*b/min;
			min = 1;
			m=2;
		}
		
		for(int i = 0; i < n; i++) {
			System.out.println(nums[i]);
		}
	}
}

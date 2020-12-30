import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		int n = 0, sum = 0;
		for(int i = 0; i < num; i++) {
			int a = scan.nextInt();
			if(a == 1) {
				if(n != 0) {
					n++;
					sum += n;
				}
				else {
					n++;
					sum += n;
				}
			}
			else {
				n = 0;
			}
		}
		
		System.out.println(sum);
	}
}

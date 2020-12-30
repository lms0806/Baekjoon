import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num = 0, sum = 0;
		for(int i = 0; i < 4; i++) {
			sum -= scan.nextInt();
			sum += scan.nextInt();
			if(sum > num) {
				num = sum;
			}
		}
		
		System.out.println(num);
	}
}

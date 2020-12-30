import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num = 0, sum = 0;
		int n = 0;
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 4; j++) {
				sum += scan.nextInt();
			}
			if(sum > num) {
				n = i+1;
				num = sum;
			}
			sum = 0;
		}
		System.out.print(n + " " + num);
	}
}

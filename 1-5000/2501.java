import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		int num = 1, count = 0;
		while(a+1 != num) {
			if(a%num == 0) {
				count++;
				if(count == b) {
					System.out.println(num);
					break;
				}
			}
			num++;
		}
		
		if(num == a+1) {
			System.out.println(0);
		}
	}
}

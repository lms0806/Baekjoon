import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		for(int i = 0; i < num; i++) {
			long a = scan.nextLong();
			long b = scan.nextLong();
			long c = scan.nextLong();
			
			if(a < b-c) {
				System.out.println("advertise");
			}
			else if(a > b-c) {
				System.out.println("do not advertise");
			}
			else{
				System.out.println("does not matter");
			}
		}
	}
}

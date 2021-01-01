import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int size = scan.nextInt();
		int[] num = new int[5];
		
		for(int i = 0; i < size; i++) {
			long a = scan.nextLong();
			long b = scan.nextLong();
			
			if(a == 0 || b == 0) {
				num[4]++;
			}
			else if(a > 0) {
				if(b > 0) {
					num[0]++;
				}
				else{
					num[3]++;
				}
			}
			else {
				if(b > 0) {
					num[1]++;
				}
				else{
					num[2]++;
				}
			}
		}
		
		for(int i = 0; i < num.length-1; i++) {
			System.out.println("Q" + (i+1) + ": " + num[i]);
		}
		System.out.println("AXIS: " + num[4]);
	}
}

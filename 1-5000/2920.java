import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] num = new int[8];
		
		for(int i = 0; i < num.length; i++) {
			num[i] = scan.nextInt();
		}
		
		int count = 0;
		for(int i = 0; i < num.length; i++) {
			if(num[i] == i+1) {
				count++;
			}
		}
		
		int count1 = 0;
		for(int i = 0; i < num.length; i++) {
			if(num[i] == num.length-i) {
				count1++;
			}
		}
		if(count == 8) {
			System.out.println("ascending");
		}
		else if(count1 == 8) {
			System.out.println("descending");
		}
		else {
			System.out.println("mixed");
		}
	}
}

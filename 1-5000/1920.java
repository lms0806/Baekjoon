import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int size1 = scan.nextInt();
		int[] num1 = new int[size1];
		
		for(int i = 0; i < size1; i++) {
			num1[i] = scan.nextInt();
		}
		
		int size2 = scan.nextInt();
		int[] num2 = new int[size2];
		
		for(int i = 0; i < size2; i++) {
			num2[i] = scan.nextInt();
		}
		
		int[] answer = new int[size2];
		for(int i = 0; i < size2; i++) {
			for(int j = 0; j < size1; j++) {
				if(num2[i] == num1[j]) {
					answer[i] = 1;
					break;
				}
			}
		}
		
		for(int i = 0; i < size2; i++) {
			System.out.println(answer[i]);
		}
	}
}

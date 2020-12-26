import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int number = scan.nextInt();
		
		for(int i = 0; i < number; i++) {
			String str = scan.next();
			String[] strs = str.split("");
			int[] num = new int[strs.length];
			int sum = 0;
			int count = 1;
			
			for(int j = 0; j < strs.length; j++) {
				if(strs[j].equals("O")) {
					num[j] += count;
					count++;
				}
				else {
					count = 1;
				}
			}
			
			for(int j = 0; j < num.length; j++) {
				sum += num[j];
			}
			System.out.println(sum);
		}
	}
}

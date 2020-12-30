import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = 300;
		int b = 60;
		int c = 10;
		
		int num = scan.nextInt();
		
		int count1 = 0, count2 = 0, count3 = 0;
		
		while(num != 0) {
			if(num >= a) {
				num-=a;
				count1++;
			}
			else if(num >= b) {
				num-=b;
				count2++;
			}
			else if(num >= c) {
				num-=c;
				count3++;
			}
			else {
				num = -1;
				break;
			}
		}
		
		if(num == -1) {
			System.out.println("-1");
		}
		else {
			System.out.println(count1 + " " + count2 + " " + count3);
		}
	}
}

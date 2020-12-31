import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		String last = "";
		int count = 0;
		for(int i = 0; i < num; i++) {
			String str = scan.next();
			if(!last.equals("")) {
				if(!last.equals(str.substring(0,1))){
					System.out.println("0");
					break;
				}
			}
			last = str.substring(str.length()-1, str.length());
			count++;
		}
		if(count == num) {
			System.out.println("1");
		}
	}
}

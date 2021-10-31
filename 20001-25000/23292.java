import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String d = br.readLine();
		
		int max = 0;
		int n = Integer.parseInt(br.readLine());
		
		String answer = "";
		while(n --> 0) {
			String date = br.readLine();
			int a = 0, b = 0, c = 0;
			for(int i = 0; i < 4; i++) {
				a += mul(d.charAt(i) - date.charAt(i));
			}
			for(int i = 4; i < 6; i++) {
				b += mul(d.charAt(i) - date.charAt(i));
			}
			for(int i = 6; i < 8; i++) {
				c += mul(d.charAt(i) - date.charAt(i));
			}
			
			int sum = a * b * c;
			if(sum > max) {
				max = sum;
				answer = date;
			}
			else if(sum == max) {
				if(answer.compareTo(date) > 0) {
					answer = date;
				}
			}
		}
		System.out.print(answer);
	}
	
	public static int mul(int num) {
		return (int) Math.pow(num, 2);
	}
}

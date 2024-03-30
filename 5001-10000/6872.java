import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine()), b = Integer.parseInt(br.readLine());
		
		int answer = 0;
		for(int i = a; i <= b; i++) {
			if(check(i)) {
				answer++;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append("The number of RSA numbers between ").append(a).append(" and " ).append(b).append(" is ").append(answer);
		System.out.print(sb);
	}
	
	public static boolean check(int num) {
		int count = 0;
		
		for(int i = 1; i * i <= num; i++) {
			if(num % i == 0) {
				count += i * i == num ? 1 : 2;
			}
		}
		
		return count == 4;
	}
}

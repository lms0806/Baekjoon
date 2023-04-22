import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		long b = Long.parseLong(st.nextToken());
		
		long answer = 0;
		for(int i = 1; i <= n; i++) {
			int num = i;
			
			int size = 0;
			while(num != 0) {
				size++;
				num /= 10;
			}
			
			answer *= Math.pow(10, size);
			answer += i;
			answer %= b;
		}
		System.out.print(answer);
	}
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[3];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < 3; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int answer = Integer.MAX_VALUE;
		for(int i = 0; i < 4; i++) {
			int num = choice(i, arr[0], arr[1]);
			
			if(num == Integer.MIN_VALUE) {
				continue;
			}
			
			for(int j = 0; j < 4; j++) {
				if(choice(j, num, arr[2]) < 0) {
					continue;
				}
				
				answer = Math.min(answer, choice(j, num, arr[2]));
			}
		}
		System.out.println(answer);
	}
		
	public static int choice(int n, int a, int b) {
		if(n == 0) {
			return a + b;
		}
		else if(n == 1) {
			return a - b;
		}
		else if(n == 2) {
			return a * b;
		}
		return a % b == 0 ? a / b : Integer.MIN_VALUE;
	}
}

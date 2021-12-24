import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int[] arr = new int[4];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < 4; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int n = solve(arr[0] * 1000 + arr[1] * 100 + arr[2] * 10 + arr[3]);
		
		int answer = 0;
		for(int i = 1111; i <= n; i++) {
			if(solve(i) == i){
				answer++;
			}
		}
		
		System.out.print(answer);
	}
	
	public static int solve(int n) {
		int temp = n;
		for(int i = 0; i < 3; i++) {
			n = n % 1000 * 10 + n / 1000;
			temp = Math.min(temp, n);
		}
		return temp;
	}
}

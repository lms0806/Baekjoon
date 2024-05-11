import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine()), num = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = (int) Math.pow(Integer.parseInt(st.nextToken()), num);
		}
		
		int answer = 0;
		for(int a : arr) {
			if(a > 0) {
				answer += a;
			}
		}
		System.out.print(answer);
	}
}

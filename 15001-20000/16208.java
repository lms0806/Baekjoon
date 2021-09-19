import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int size = Integer.parseInt(br.readLine());
		
		long[] n = new long[size];
		
		long sum = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < size; i++) {
			n[i] = Long.parseLong(st.nextToken());
			sum += n[i];
		}
		
		long answer = 0;
		for(int i = 0; i < size; i++) {
			answer += (sum - n[i]) * n[i];
			sum -= n[i];
		}
		System.out.print(answer);
	}
}

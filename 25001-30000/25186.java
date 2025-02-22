import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		long sum = 0, max = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		while(n --> 0) {
			long num = Long.parseLong(st.nextToken());
			
			sum += num;
			max = Math.max(max, num);
		}
		System.out.print(sum == 1 || max <= sum / 2 ? "Happy" : "Unhappy");
	}
}

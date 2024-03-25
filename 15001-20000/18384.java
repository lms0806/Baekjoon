import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		boolean[] prime = new boolean[1000001];
		prime[0] = prime[1] = true;
		for(int i = 2; i * i < 1000001; i++) {
			if(!prime[i]) {
				for(int j = i * i; j < 1000001; j += i) {
					prime[j] = true;
				}
			}
		}
		
		int[] arr = new int[1000001];
		arr[1000000] = 1000003;
		for(int i = 1000000 - 1; i > 0; i--) {
			arr[i] = !prime[i] ? i : arr[i + 1];
		}
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			long sum = 0;
			StringTokenizer st = new StringTokenizer(br.readLine());
			while(st.hasMoreTokens()) {
				sum += arr[Integer.parseInt(st.nextToken())];
			}
			sb.append(sum).append("\n");
		}
		System.out.print(sb);
	}
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[n], sum = new int[n];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			sum[i] = arr[i] = Integer.parseInt(st.nextToken());
			
			if(i > 0) {
				sum[i] += sum[i - 1];
			}
		}
		
		HashSet<Integer> set = new HashSet<>();
		for(int i = 0; i < n; i++) {
			set.add(sum[i]);
			
			for(int j = 0; j < i; j++) {
				set.add(sum[i] - sum[j]);
			}
		}
		
		StringBuilder sb = new StringBuilder();
		st = new StringTokenizer(br.readLine());
		while(m --> 0) {			
			sb.append(set.contains(Integer.parseInt(st.nextToken())) ? "JAH" : "EI").append("\n");
		}
		System.out.print(sb);
	}
}

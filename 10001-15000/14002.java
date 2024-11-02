import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int[] dp = new int[n], num = new int[n];
		Arrays.fill(num, -1);
		Arrays.fill(dp, 1);
		
		for(int i = 1; i < n; i++) {
			for(int j = 0; j < i; j++) {
				if(arr[i] > arr[j]) {
					if(dp[i] < dp[j] + 1) {
						dp[i] = dp[j] + 1;
						num[i] = j;
					}
				}
			}
		}
		
		int max = 0, idx = 0;
		for(int i = 0; i < n; i++) {
			if(max < dp[i]) {
				max = dp[i];
				idx = i;
			}
		}
		
		ArrayList<Integer> list = new ArrayList<>();
		while(idx != -1) {
			list.add(arr[idx]);
			idx = num[idx];
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append(list.size()).append("\n");
		for(int i = list.size() - 1; i >= 0; i--) {
			sb.append(list.get(i)).append(" ");
		}
		System.out.println(sb);
	}
}

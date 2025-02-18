import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			int n = Integer.parseInt(br.readLine());
			
			int[] arr = new int[n];
			HashSet<Integer> set = new HashSet<>();
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
				set.add(arr[i]);
			}
			
			Arrays.sort(arr);
			
			int answer = 0;
			for(int i = 0; i < n; i++) {
				for(int j = i + 1; j < n; j++) {
					if(set.contains(arr[j] + (arr[j] - arr[i]))) {
						answer++;
					}
				}
			}
			sb.append(answer).append("\n");
		}
		System.out.print(sb);
	}
}

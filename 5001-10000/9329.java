import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
			
			ArrayList<Integer>[] arr = new ArrayList[n];
			
			for(int i = 0; i < n; i++) {
				arr[i] = new ArrayList<>();
				
				st = new StringTokenizer(br.readLine());
				int k = Integer.parseInt(st.nextToken());
				
				while(k --> -1) {
					arr[i].add(Integer.parseInt(st.nextToken()));
				}
			}
			
			int[] num = new int[m];
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < m; i++) {
				num[i] = Integer.parseInt(st.nextToken());
			}
			
			int answer = 0;
			for(int i = 0; i < n; i++) {
				int min = Integer.MAX_VALUE;
				for(int j = 0; j < arr[i].size() - 1; j++) {
					min = Math.min(min, num[arr[i].get(j) - 1]);
				}
				answer += min * arr[i].get(arr[i].size() - 1);
			}
			sb.append(answer).append("\n");
		}
		System.out.print(sb);
	}
}

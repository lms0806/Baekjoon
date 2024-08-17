import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		StringBuilder sb = new StringBuilder();
		while(true) {
			int n = Integer.parseInt(br.readLine());
			
			if(n == 0) {
				break;
			}
			
			HashSet<Integer>[] arr = new HashSet[n];
			for(int i = 0; i < n; i++) {
				arr[i] = new HashSet<>();
			}
			
			for(int i = 0; i < n; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				int num = Integer.parseInt(st.nextToken());
				
				while(num --> 0) {
					arr[i].add(Integer.parseInt(st.nextToken()));
				}
			}
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			int k = Integer.parseInt(st.nextToken());
			
			int[] list = new int[k];
			for(int i = 0; i < k; i++) {
				list[i] = Integer.parseInt(st.nextToken());
			}
			
			sb.append(solve(arr, list)).append("\n");
		}
		System.out.print(sb);
	}
	
	public static int solve(HashSet<Integer>[] arr, int[] list) {
		int count = 0, answer = -1;
		for(int i = 0; i < arr.length; i++) {
			boolean flag = true;
			for(int j = 0; j < list.length; j++) {
				if(!arr[i].contains(list[j])) {
					flag = false;
					break;
				}
			}
			
			if(flag) {
				answer = i + 1;
				count++;
				
				if(count > 1) {
					return -1;
				}
			}
		}
		return answer;
	}
}

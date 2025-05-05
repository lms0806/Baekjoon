import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int[] arr;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int idx = Integer.parseInt(st.nextToken());
			
			arr = new int[12];
			for(int i = 0; i < 12; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			int answer = 0;
			for(int i = 0; i < 12; i++) {
				for(int j = i + 2; j < 12; j++) {
					if(solve(i, j)) {
						answer++;
					}
				}
			}
			sb.append(idx).append(" ").append(answer).append("\n");
		}
		System.out.print(sb);
	}
	
	public static boolean solve(int i, int j) {
		int max = Math.max(arr[i], arr[j]);
		
		for(int k = i + 1; k < j; k++) {
			if(arr[k] <= max) {
				return false;
			}
		}
		return true;
	}
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{ 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		int[][] arr = new int[367][2];
		
		int[] answer = new int[5];
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int idx = st.nextToken().charAt(0) == 'T' ? 0 : 1;
			int s = Integer.parseInt(st.nextToken()), e = Integer.parseInt(st.nextToken());
			
			answer[4] = Math.max(answer[4], e - s + 1);
			for(int i = s; i <= e; i++) {
				arr[i][idx]++;
			}
		}
		
		for(int i = 0; i < 367; i++) {
			if(arr[i][0] + arr[i][1] >= 1) {
				answer[0]++;
			}
			
			answer[1] = Math.max(answer[1], arr[i][0] + arr[i][1]);
			
			if(arr[i][0] != 0 && arr[i][0] == arr[i][1]) {
				answer[2]++;
				answer[3] = Math.max(answer[3], arr[i][0] + arr[i][1]);
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int a : answer) {
			sb.append(a).append("\n");
		}
		System.out.print(sb);
	}
}

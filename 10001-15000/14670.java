import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[][] arr = new int[n][2];
		
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		
		n = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(n --> 0) {
			String answer = "";
			StringTokenizer st = new StringTokenizer(br.readLine());
			int t = Integer.parseInt(st.nextToken());
			
			while(t --> 0) {
				int num = Integer.parseInt(st.nextToken());
				
				boolean flag = false;
				for(int i = 0; i < arr.length; i++) {
					if(arr[i][0] == num) {
						answer += arr[i][1] + " ";
						flag = true;
					}
				}
				if(!flag) {
					answer = "YOU DIED";
					break;
				}
			}
			sb.append(answer).append("\n");
		}
		System.out.print(sb);
	}
}

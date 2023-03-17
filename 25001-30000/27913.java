import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), t = Integer.parseInt(st.nextToken());
		
		boolean[] arr = new boolean[n];
		
		int answer = 0;
		for(int i = 0; i < n; i++) {
			if(i % 10 == 0 || i % 10 == 3 || i % 10 == 6) {
				arr[i] = true;
				answer++;
			}
		}

		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			int num = Integer.parseInt(br.readLine()) - 1;
			
			answer += arr[num] ? -1 : 1;
			arr[num] = !arr[num];
			
			sb.append(answer).append("\n");
		}
		System.out.print(sb);
	}
}

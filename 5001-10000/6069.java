import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		boolean[] light = new boolean[n + 1];
		
		StringBuilder sb = new StringBuilder();
		while(m --> 0) {
			st = new StringTokenizer(br.readLine());
			
			int choice = Integer.parseInt(st.nextToken());
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
			
			if(choice == 0) {
				for(int i = a; i <= b; i++) {
					light[i] = !light[i];
				}
			}
			else {
				int answer = 0;
				for(int i = a; i <= b; i++) {
					if(light[i]) {
						answer++;
					}
				}
				sb.append(answer).append("\n");
			}
		}
		System.out.print(sb);
	}
}

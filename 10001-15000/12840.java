import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int time = Integer.parseInt(st.nextToken()) * 3600 + Integer.parseInt(st.nextToken()) * 60 + Integer.parseInt(st.nextToken());
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			String str = br.readLine();
			
			if(str.equals("3")) {
				sb.append(time / 3600).append(" ").append(time / 60 % 60).append(" ").append(time % 60).append("\n");
			}
			else {
				st = new StringTokenizer(str);
				int choice = Integer.parseInt(st.nextToken());
				int num = Integer.parseInt(st.nextToken());
				
				time += choice == 2 ? -num : num;
				time %= 86400;
				
				while(time < 0) {
					time += 86400;
				}
			}
		}
		System.out.print(sb);
	}
}

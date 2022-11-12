import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int k = Integer.parseInt(st.nextToken());
			
			if(k == 0) {
				break;
			}
			
			int m = Integer.parseInt(st.nextToken());
			
			ArrayList<String> arr = new ArrayList<>();
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < k; i++) {
				arr.add(st.nextToken());
			}
			
			String answer = "yes";
			while(m --> 0) {
				st = new StringTokenizer(br.readLine());
				int n = Integer.parseInt(st.nextToken()), num = Integer.parseInt(st.nextToken());
				
				int count = 0;
				while(n --> 0) {
					if(arr.contains(st.nextToken())) {
						count++;
					}
				}
				
				if(count < num) {
					answer = "no";
				}
			}
			
			sb.append(answer).append("\n");
		}
		System.out.print(sb);
	}
}

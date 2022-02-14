import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] answer = new int[3], deliver = new int[3];
		
		int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken()), d = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < 3; i++) {
			deliver[i] = Integer.parseInt(st.nextToken());
			
			int dog1 = deliver[i] % (a + b);
			int dog2 = deliver[i] % (c + d);
			
			if(dog1 <= a && dog1 != 0) {
				answer[i]++;
			}
			if(dog2 <= c && dog2 != 0) {
				answer[i]++;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 3; i++) {
			sb.append(answer[i]).append("\n");
		}
		System.out.print(sb);
	}
}

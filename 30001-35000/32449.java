import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		String[] str = new String[n];
		int[] num = new int[n];
		
		long max = 0;
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			str[i] = st.nextToken();
			num[i] = Integer.parseInt(st.nextToken());
			
			if("pig".equals(str[i])) {
				max = Math.max(max, num[i]);
			}
		}
		
		long answer = max;
		for(int i = 0; i < n; i++) {
			if(!"pig".equals(str[i]) && num[i] < max) {
				answer += num[i];
			}
		}
		System.out.print(answer);
	}
}

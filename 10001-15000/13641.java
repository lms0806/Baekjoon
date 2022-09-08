import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
 	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s;
		StringBuilder sb = new StringBuilder();
		while((s = br.readLine()) != null) {
			int n = Integer.parseInt(s);
			
			if(n == 0) {
				break;
			}
			
			int[] a = new int[n], b = new int[n];
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i = 0; i < n; i++) {
				a[i] = Integer.parseInt(st.nextToken());
			}
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < n; i++) {
				b[i] = Integer.parseInt(st.nextToken());
			}
			
			int answer = 0;
			for(int i = 0; i < n; i++) {
				for(int j = i + 1; j < n; j++) {
					if(a[i] == b[i]) {
						break;
					}
					int temp = b[i];
					b[i] = b[j];
					b[j] = temp;
					answer++;
				}
			}
			sb.append(answer).append("\n");
		}
		System.out.print(sb);
	}
}

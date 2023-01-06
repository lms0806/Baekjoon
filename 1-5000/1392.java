import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), t = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			int num = Integer.parseInt(br.readLine()) + 1;
			
			int count = 0;
			for(int i = 0; i < n; i++) {
				if(num > 0) {
					num -= arr[i];
					count++;
				}
			}
			sb.append(count).append("\n");
		}
		System.out.print(sb);
	}
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			int n = Integer.parseInt(br.readLine());
			
			int[] arr = new int[1001];
			
			for(int i = 0; i < n; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				
				st.nextToken();
				int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
				
				for(int j = a; j < b; j++) {
					arr[j]++;
				}
			}
			
			for(int i = 0; i < arr.length; i++) {
				if(arr[i] > 0) {
					sb.append((char)(arr[i] + 'A' - 1));
				}
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		int answer = 0;
		for(int i = 0; i < n; i++) {
			int[] arr = new int[m];
			
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < m; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
			}
			
			for(int j = 0; j < m; j++) {
				if(arr[j] > 0) {
					for(int k = j + 1; k < m; k++) {
						if(arr[k] == 0) {
							break;
						}
						
						if(arr[k] == arr[j]) {
							arr[k] = 0;
						}
					}
					answer++;
				}
			}
		}
		System.out.print(answer);
	}
}

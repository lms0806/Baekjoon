import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		int[] choice = new int[n];
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int p = Integer.parseInt(st.nextToken()), l = Integer.parseInt(st.nextToken());
		
			int[] arr = new int[p];
			
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < p; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
			}
			
			Arrays.sort(arr);
			
			choice[i] = p < l ? 1 : arr[p - l];
		}
		
		Arrays.sort(choice);
		
		int count = 0;
		for(int i = 0; i < n; i++) {
			if(m >= choice[i]) {
				m -= choice[i];
				
				count++;
			}
			else {
				break;
			}
		}
		
		System.out.print(count);
	}
}

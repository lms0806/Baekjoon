import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int n, k;
	static int[] arr;
 	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		
		arr = new int[n];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		System.out.print(solve());
	}
 	
 	public static int solve() {
 		for(int i = 1; i < n; i++) {
			int j, x = arr[i];
			
			for(j = i - 1; j >= 0; j--) {
				if(x < arr[j]) {
					arr[j + 1] = arr[j];
					if(--k == 0) {
						return arr[j + 1];
					}
				}
				else {
					break;
				}
			}
			if(j + 1 != i) {
				arr[j + 1] = x;
				if(--k == 0) {
					return arr[j + 1];
				}
			}
		}
 		return -1;
 	}
}

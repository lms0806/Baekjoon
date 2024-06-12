import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[3];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), ":");
		for(int i = 0; i < 3; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int answer = 0;
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(i == j) {
					continue;
				}
				
				for(int k = 0; k < 3; k++) {
					if(i == k || j == k) {
						continue;
					}
					
					if(arr[i] > 0 && arr[i] < 13 && arr[j] >= 0 && arr[j] < 60 && arr[k] >= 0 && arr[k] < 60) {
						answer++;
					}
				}
			}
		}
		System.out.print(answer);
	}
}

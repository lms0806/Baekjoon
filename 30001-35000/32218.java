import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int answer = 1;
		while(true) {
			boolean flag = true;
			for(int i = 0; i < n; i++) {
				if(arr[i] != 0) {
					flag = false;
					break;
				}
			}
			
			if(flag) {
				break;
			}
			
			for(int i = 0; i < n; i++) {
				int count = 0;
				for(int j = i + 1; j < n; j++) {
					if(arr[i] < arr[j]) {
						count++;
					}
				}
				arr[i] = count;
			}
			
			answer++;
		}
		System.out.print(answer);
	}
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		StringBuilder sb = new StringBuilder();
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int n = Integer.parseInt(st.nextToken());
			
			if(n == 0) {
				break;
			}
			
			int[] arr = new int[n];
			
			int zero = 0;
			for(int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
				
				if(arr[i] == 0) {
					zero++;
				}
			}
			
			Arrays.sort(arr);
			
			if(zero == 1) {
				int num = arr[0];
				arr[0] = arr[2];
				arr[2] = num;
			}
			else {
				int num = arr[0];
				arr[0] = arr[zero];
				arr[zero] = num;
				
				num = arr[1];
				arr[1] = arr[zero + 1];
				arr[zero + 1] = num;
			}
			
			int a = 0, b = 0;
			for(int i = 0; i < n; i++) {
				if(i % 2 == 0) {
					a += arr[i];
					a *= 10;
				}
				else {
					b += arr[i];
					b *= 10;
				}
			}
			
			a /= 10;
			b /= 10;
			
			sb.append(a + b).append("\n");
		}
		System.out.print(sb);
	}
}

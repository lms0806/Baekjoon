import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			String[] s = br.readLine().split(":");
			
			arr[i] = Integer.parseInt(s[0]) * 60 + Integer.parseInt(s[1]);
		}
		
		Arrays.sort(arr);
		
		int answer = 0, count = 0, num = 0;
		for(int i = 0; i < n; i++) {
			if(num == 0) {
				num = arr[i];
				count++;
			}
			else {
				if(arr[i] - num > 10 || count == 3) {
					answer++;
					count = 1;
					num = arr[i];
				}
				else {
					count++;
				}
			}
		}
		System.out.print(answer + (count != 0 ? 1 : 0));
	}
}

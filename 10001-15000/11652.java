import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		
		long[] num = new long[n];
		for(int i = 0; i < n; i++) {
			num[i] = Long.parseLong(br.readLine());
		}
		
		Arrays.sort(num);
		
		int count = 1, max = 0, index = 0;
		for(int i = 0; i < n - 1; i++) {
			if(num[i] == num[i + 1]) {
				count++;
				if(count > max) {
					max = count;
					index = i;
				}
			}
			else {
				count = 1;
			}
		}
		System.out.print(num[index]);
	}
}

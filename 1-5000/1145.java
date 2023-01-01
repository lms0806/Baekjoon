import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[5];
		
		int num = Integer.MAX_VALUE;
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < 5; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			num = Math.min(num, arr[i]);
		}
		
		while(true) {
			int count = 0;
			for(int i = 0; i < 5; i++) {
				if(num % arr[i] == 0) {
					count++;
				}
			}
			
			if(count > 2) {
				break;
			}
			
			num++;
		}
		System.out.print(num);
	}
}

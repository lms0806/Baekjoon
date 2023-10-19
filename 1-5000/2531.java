import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		int answer = 0;
		for(int i = 0; i < n; i++) {
			int flag = 0;
			boolean coupon = true;
			boolean[] check = new boolean[d + 1];
			for(int j = i; j < i + k; j++) {
				if(check[arr[j % n]]) {
					flag++;
				}
				else {
					check[arr[j % n]] = true;
				}
				
				if(arr[j % n] == c) {
					coupon = false;
				}
			}
			
			answer = Math.max(answer, k - flag + (coupon ? 1 : 0));
		}
		System.out.print(answer);
	}
}

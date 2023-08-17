import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), t = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[n], plus = new int[n];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int which = 0;
		while(t --> 0) {
			st = new StringTokenizer(br.readLine());
			
			int choice = Integer.parseInt(st.nextToken());
			
			if(choice == 1) {
				int num = Integer.parseInt(st.nextToken()) - which - 1;
				
				while(num < 0) {
					num += n;
				}
				if(num >= n) {
					num %= n;
				}
				
				plus[num] += Integer.parseInt(st.nextToken());
			}
			else if(choice == 2) {				
				which += Integer.parseInt(st.nextToken());
				
				if(which >= n) {
					which %= n;
				}
			}
			else {
				which -= Integer.parseInt(st.nextToken());
				
				while(which < 0) {
					which += n;
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = n - which; i < n; i++) {
			sb.append(arr[i] + plus[i]).append(" ");
		}
		for(int i = 0; i < n - which; i++) {
			sb.append(arr[i] + plus[i]).append(" ");
		}
		System.out.print(sb);
	}
}

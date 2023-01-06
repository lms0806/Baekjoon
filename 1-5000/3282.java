import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), t = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[n];
		
		int idx = 0;
		while(t -- > 0) {
			int num = Integer.parseInt(br.readLine());
			
			while(num != 0) {
				if(arr[idx] != 2) {
					if(num == 1) {
						arr[idx] = arr[idx] == 1 ? 2 : 1;
						num = 0;
					}
					else {
						num -= arr[idx] == 1 ? 1 : 2;
						arr[idx] = 2;
					}
				}
				idx++;
				
				if(idx == n) {
					idx = 0;
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int a : arr) {
			sb.append(a).append("\n");
		}
		System.out.print(sb);
	}
}

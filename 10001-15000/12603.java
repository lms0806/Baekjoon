import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
	
		int size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int t = 1; t <= size; t++) {
			int num = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			
			int[] arr = new int[n];
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			int a = 0, b = 0, max = Integer.MIN_VALUE;
			for(int i = 0; i < n; i++) {
				for(int j = i + 1; j < n; j++) {
					int sum = arr[i] + arr[j];
					
					if(sum <= num && sum > max) {
						max = sum;
						a = i + 1;
						b = j + 1;
					}
				}
			}
			sb.append("Case #").append(t).append(": ").append(a).append(" ").append(b).append("\n");
		}
		System.out.print(sb);
	}
}

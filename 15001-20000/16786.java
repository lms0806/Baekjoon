import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
	
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int t = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine());
		while(t --> 0) {
			int num = Integer.parseInt(st.nextToken()) - 1;
			
			if((num < n - 1 && arr[num + 1] == arr[num] + 1) || arr[num] == 2019) {
				continue;
			}
			
			arr[num]++;
		}
		
		StringBuilder sb = new StringBuilder();
		for(int a : arr) {
			sb.append(a).append("\n");
		}
		System.out.print(sb);
	}
}

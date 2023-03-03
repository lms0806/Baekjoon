import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			br.readLine();
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken()), e = Integer.parseInt(st.nextToken());
			
			int[] arr = new int[n];
			
			for(int i = 0; i < n; i++) {
				arr[i] = i + 1;
			}
			
			int idx = -1;
			while(e --> 0) {
				arr[Integer.parseInt(br.readLine()) - 1] = idx;
				idx--;
			}
			
			int answer = 0, max = Integer.MIN_VALUE;
			for(int i = 0; i < n; i++) {
				if(max < arr[i]) {
					answer = i;
					max = arr[i];
				}
			}
			
			sb.append(answer + 1).append("\n");
		}
		System.out.print(sb);
	}
}

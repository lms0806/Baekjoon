import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			int n = Integer.parseInt(br.readLine());
			
			int[] arr = new int[n];
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			HashSet<String> set = new HashSet<>();
			while(true) {
				if(set.contains(Arrays.toString(arr))) {
					sb.append("LOOP");
					break;
				}

				set.add(Arrays.toString(arr));
				
				boolean flag = true;
				int[] temp = new int[n];
				for(int i = 1; i < n; i++) {
					temp[i] = Math.abs(arr[i - 1] - arr[i]);
				}
				temp[0] = Math.abs(arr[n - 1] - arr[0]);
				
				for(int i = 0; i < n; i++) {
					if(temp[i] != 0) {
						flag = false;
						break;
					}
				}
				
				if(flag) {
					sb.append("ZERO");
					break;
				}
				
				arr = temp;
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}

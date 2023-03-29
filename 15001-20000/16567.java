import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), t = Integer.parseInt(st.nextToken());
		
		boolean[] arr = new boolean[n];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken()) == 0 ? false : true;
		}
		
		int count = 0;
		boolean flag = false;
		for(int i = 0; i < n; i++) {
			if(arr[i] && !flag) {
				flag = true;
				count++;
			}
			else if(!arr[i]){
				flag = false;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			st = new StringTokenizer(br.readLine());
			
			if(Integer.parseInt(st.nextToken()) == 1) {
				int idx = Integer.parseInt(st.nextToken()) - 1;
				
				if(arr[idx]) {
					continue;
				}
				arr[idx] = true;
				
				if(idx == 0) {
					if(!arr[idx + 1]) {
						count++;
					}
				}
				else if(idx == n - 1) {
					if(!arr[idx - 1]) {
						count++;
					}
				}
				else {
					if(!arr[idx - 1]  && !arr[idx + 1]) {
						count++;
					}
					else if(arr[idx - 1] && arr[idx + 1]){
						count--;
					}
				}
			}
			else {
				sb.append(count).append("\n");
			}
		}
		System.out.print(sb);
	}
}

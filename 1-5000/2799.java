import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[5];
		
		for(int i = 0; i < n; i++) {
			br.readLine();
			String[] s = new String[4];
			for(int j = 0; j < 4; j++) {
				s[j] = br.readLine();
			}
			
			int idx = 1;
			for(int j = 0; j < m; j++) {
				int num = 0;
				for(int k = 0; k < 4; k++) {
					if(s[k].charAt(idx) == '*') {
						num++;
					}
					else {
						break;
					}
				}
				arr[num]++;
				idx += 5;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int a : arr) {
			sb.append(a).append(" ");
		}
		System.out.print(sb);		
	}
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int joe = 0, jean = 0, jane = 0, james = 0, other = 0;
		StringBuilder sb = new StringBuilder();
		while(true) {
			int t = Integer.parseInt(br.readLine().trim());
			
			if(t == 0) {
				break;
			}
			
			int[] a = new int[5];
			
			while(t --> 0) {
				String s = br.readLine().trim();
				
				char c = s.charAt(0);
				if(c == 'M' || c == 'L') {
					a[0]++;
				}
				else if(c == 'S') {
					a[3]++;
				}
				else if(c == 'X') {
					a[4]++;
				}
				else {
					a[Integer.parseInt(s) >= 12 ? 1 : 2]++;
				}
			}
			
			for(int ar : a) {
				sb.append(ar).append(" ");
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}

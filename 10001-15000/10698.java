import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		int a, b, c;
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < size; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			String[] strs = new String[5];
			for(int j = 0; j < 5; j++) {
				strs[j] = st.nextToken();
			}
			
			a = Integer.parseInt(strs[0]);
			b = Integer.parseInt(strs[2]);
			c = Integer.parseInt(strs[4]);
			
			sb.append("Case ").append(i+1).append(": ");
			if(strs[1].equals("+")) {
				if(a+b == c) {
					sb.append("YES");
				}
				else {
					sb.append("NO");
				}
			}
			else {
				if(a-b == c) {
					sb.append("YES");
				}
				else {
					sb.append("NO");
				}
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}

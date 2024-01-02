import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int idx = 0;
			for(char c : st.nextToken().toCharArray()) {
				if(c == 'x' || c == 'X') {
					break;
				}
				
				idx++;
			}
			
			sb.append(st.nextToken().toUpperCase().charAt(idx));
		}
		System.out.print(sb);
	}
}

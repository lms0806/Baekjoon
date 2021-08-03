import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int count = 1;
		StringBuilder sb = new StringBuilder();
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			char c = st.nextToken().charAt(0), c1 = st.nextToken().charAt(0);
			
			if(c == '#'){
				break;
			}
			
			int size = Integer.parseInt(br.readLine());
			
			sb.append("Case ").append(count).append("\n");
			for(int i = 1; i <= size; i++) {
				for(char ch : br.readLine().toCharArray()) {
					sb.append(ch == c || ch == c1 || ch == (c - 'a' + 'A') || ch == (c1 - 'a' + 'A') ? "_" : ch);
				}
				sb.append("\n");
			}
			sb.append("\n");
			
			count++;
		}
		System.out.print(sb);
	}
}

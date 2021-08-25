import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			int n = Integer.parseInt(br.readLine());
			
			if(n == 0) {
				break;
			}
			
			int num = 0;
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i = 0; i < n; i++) {
				if(Integer.parseInt(st.nextToken()) == 1) {
					num++;
				}
			}
			
			sb.append("Mary won ").append(n - num).append(" times and John won ").append(num).append(" times\n");
		}
		System.out.print(sb);
	}
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int n = Integer.parseInt(br.readLine()), m = Integer.parseInt(br.readLine());
		
		int max = m;
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			m += Integer.parseInt(st.nextToken()) - Integer.parseInt(st.nextToken());
			
			if(m < 0) {
				max = 0;
				break;
			}
			
			if(m > max) {
				max = m;
			}
		}
		System.out.print(max);
	}
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException { 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int answer = 777;
		for(int i = 0; i < 3; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			boolean flag = false;
			for(int j = 0; j < n; j++) {
				if(Integer.parseInt(st.nextToken()) == 7) {
					flag = true;
					break;
				} 
			}
			
			if(!flag) {
				answer = 0;
				break;
			}
		}
		System.out.print(answer);
	}
}

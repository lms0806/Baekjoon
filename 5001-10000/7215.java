import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int k = Integer.parseInt(st.nextToken()), n = Integer.parseInt(st.nextToken());
		
		int answer = 0;
		boolean flag = false;
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			int num = Integer.parseInt(st.nextToken());
			
			if(num >= k) {
				flag = true;
			}
			
			answer += num >= k ? k - 1 : num;
		}
		
		System.out.print(flag ? answer + 1 : -1);
	}
}

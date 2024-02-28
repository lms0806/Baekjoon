import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException, InterruptedException{ 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		int sum = 0;
		boolean flag = m <= n ? true : false;
		st = new StringTokenizer(br.readLine());
		while(m --> 0) {
			int num = Integer.parseInt(st.nextToken());
			
			sum += num / 4;
			if(num < 4) {
				flag = false;
			}
		}
		
		if(n > sum) {
			flag = false;
		}
		
		System.out.print(flag ? "DA" : "NE");
	}
}

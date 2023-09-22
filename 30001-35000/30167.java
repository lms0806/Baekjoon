import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int l = Integer.parseInt(st.nextToken()), r = Integer.parseInt(st.nextToken());
		
		int answer = -1;
		for(int i = l; i <= r; i++) {
			int n = i;
			
			boolean[] num = new boolean[10];
			
			boolean flag = true;
			while(n != 0) {
				if(num[n % 10]) {
					flag = false;
					break;
				}
				
				num[n % 10] = true;
				n /= 10;
			}
			
			if(flag) {
				answer = i;
				break;
			}
		}
		System.out.print(answer);
	}
}

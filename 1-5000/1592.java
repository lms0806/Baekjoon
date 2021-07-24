import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken()), l = Integer.parseInt(st.nextToken());
		
		int[] num = new int[n];
		
		int count = 0, answer = 0;
		num[0] = 1;
		while(num[count] != m) {
			count += num[count] % 2 == 0 ? l : -l;
			
			if(count >= n) {
				count -= n;
			}
			if(count < 0) {
				count += n;
			}
			
			num[count]++;
			answer++;
		}
		System.out.print(answer);
	}
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
		
		boolean[] flag = new boolean[n];
		while(k --> 0) {
			flag[Integer.parseInt(br.readLine()) - 1] = true;
		}
		
		int answer = 1;
		flag[0] = true;
		for(int i = 1; i < n; i++) {
			if(flag[i]) {
				answer++;
			}
			else if(!flag[i - 1]) {
				flag[i] = true;
				answer++;
			}
		}
		System.out.print(answer);
	}
}

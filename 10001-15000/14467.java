import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int n = Integer.parseInt(br.readLine());
		
		int[] num = new int[11];
		
		Arrays.fill(num, -1);
		
		int answer = 0;
		while(n --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
			
			if(num[a] == -1) {
				num[a] = b;
			}
			else if(num[a] != -1 && num[a] != b){
				num[a] = b;
				answer++;
			}
		}
		System.out.print(answer);
	}

}

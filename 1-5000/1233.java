import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int s1 = Integer.parseInt(st.nextToken()), s2 = Integer.parseInt(st.nextToken()), s3 = Integer.parseInt(st.nextToken());
		
		int[] num = new int[s1 + s2 + s3 + 1];
		
		for(int i = 1; i <= s1; i++) {
			for(int j = 1; j <= s2; j++) {
				for(int k = 1; k <= s3; k++) {
					num[i + j + k]++;
				}
			}
		}
		
		int n = 0, answer = 0;
		for(int i = 0; i < num.length; i++) {
			if(n < num[i]) {
				n = num[i];
				answer = i;
			}
		}
		System.out.print(answer);
	}
}

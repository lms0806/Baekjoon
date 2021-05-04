import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int T = Integer.parseInt(st.nextToken());
		int R = Integer.parseInt(st.nextToken());
		
		int answer = 0;
		int num = 0, X = m;
		StringBuilder sb = new StringBuilder();
		if(X + T > M && X == m) {
			sb.append(-1);
		}
		else {
			while(num != N) {
				answer++;
				if(X + T <= M) {
					X += T;
					num++;
				}
				else {
					X -= R;
					if(X < m) {
						X = m;
					}
				}
			}
			sb.append(answer);
		}
		System.out.print(sb);
	}
}

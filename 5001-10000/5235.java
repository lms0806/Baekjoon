import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(size --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int num = Integer.parseInt(st.nextToken());
			
			int answer = 0;
			while(num --> 0) {
				int n = Integer.parseInt(st.nextToken());
				answer += n % 2 == 0 ? n : -n;
			}
			sb.append(answer > 0 ? "EVEN" : answer == 0 ? "TIE" : "ODD").append("\n");
		}
		System.out.print(sb);
	}
}

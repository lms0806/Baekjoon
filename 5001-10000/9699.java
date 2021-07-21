import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		int n = size;
		
		StringBuilder sb = new StringBuilder();
		while(size --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			sb.append("Case #").append(n - size).append(": ");
			int answer = 0;
			for(int i = 0; i < 5; i++) {
				answer = Math.max(answer, Integer.parseInt(st.nextToken()));
			}
			sb.append(answer).append("\n");
		}
		System.out.print(sb);
	}
}

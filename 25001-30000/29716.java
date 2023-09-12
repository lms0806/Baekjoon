import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int j = Integer.parseInt(st.nextToken()), n = Integer.parseInt(st.nextToken());
		
		int answer = 0;
		while(n --> 0) {
			int sum = 0;
			
			for(char c : br.readLine().toCharArray()) {
				sum += c >= 'A' && c <= 'Z' ? 4 : c == ' ' ? 1 : 2;
			}
			
			if(sum <= j) {
				answer++;
			}
		}
		System.out.print(answer);
	}
}

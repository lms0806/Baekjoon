import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
		char ch = st.nextToken().charAt(0);
		
		int answer = 0;
		for(int i = a; i <= b; i++) {
			for(char c : String.valueOf(i).toCharArray()) {
				if(c == ch) {
					answer++;
				}
			}
		}
		System.out.print(answer);
	}
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()), u = Integer.parseInt(st.nextToken()), l = Integer.parseInt(st.nextToken());
		
		String answer = "";
		if(n >= 1000 && (u >= 8000 || l >= 260)) {
			answer = "Very Good";
		}
		else if(n >= 1000) {
			answer = "Good";
		}
		else {
			answer = "Bad";
		}
		System.out.print(answer);
	}
}

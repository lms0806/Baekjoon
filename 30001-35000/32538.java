import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		System.out.print(solve(Integer.parseInt(st.nextToken())));
	}
	
	public static String solve(int y) {
		for(int i = 16; i > 1; i--) {
			String answer = Integer.toString(y, i);
            if (answer.endsWith("00")) {
                return i + " " + answer;
            }
		}
		return "impossible";
	}
}

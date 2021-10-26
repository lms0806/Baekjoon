import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String answer = "yes";
		HashSet<String> set = new HashSet<>();
		while(st.hasMoreTokens()) {
			if(!set.add(st.nextToken())) {
				answer = "no";
				break;
			}
		}
		System.out.print(answer);
	}
}

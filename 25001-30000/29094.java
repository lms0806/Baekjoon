import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		HashMap<String, Integer> map = new HashMap<>();
		
		while(n --> 0) {
			map.put(br.readLine(), 0);
		}
		
		int m = Integer.parseInt(br.readLine());
		
		String answer = null;
		int a = 0, b = 0, max = 0;
		while(m --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String[] str = st.nextToken().split(":");
			String name = st.nextToken();

			int na = Integer.parseInt(str[0]), nb = Integer.parseInt(str[1]);
			
			int score = map.get(name) + na - a + nb - b;
			
			map.put(name, score);
			
			if(max < score) {
				max = score;
				answer = name;
			}
			
			a = na;
			b = nb;
		}
		System.out.print(answer + " " + max);
	}
}

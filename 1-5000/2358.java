import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		HashMap<Integer, Integer> x = new HashMap<>(), y = new HashMap<>();
		
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
			
			x.put(a, x.getOrDefault(a, 0) + 1);
			y.put(b, y.getOrDefault(b, 0) + 1);
		}
		
		int answer = 0;
		for(Integer a : x.keySet()) {
			if(x.get(a) > 1) {
				answer++;
			}
		}
		for(Integer b : y.keySet()) {
			if(y.get(b) > 1) {
				answer++;
			}
		}
		System.out.print(answer);
	}
}

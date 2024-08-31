import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int answer = 0;
		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(0, 0);
		for(int i = 0; i <= n; i++) {
			int num = answer - i;
			if(num < 0 || (map.containsKey(num) && map.get(num) != i - 1)) {
				answer += i;
			}
			else {
				answer = num;
			}
			
			map.put(answer, i);
		}
		System.out.print(answer);
	}
}

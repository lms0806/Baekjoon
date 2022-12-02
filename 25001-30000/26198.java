import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		HashMap<Character, Integer> map = new HashMap<>() {{
				put('I', 1);
				put('V', 5);
				put('X', 10);
				put('L', 50);
				put('C', 100);
				put('D', 500);
				put('M', 1000);
		}};
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			int answer = 0;
			for(char c : br.readLine().toCharArray()) {
				if(map.containsKey(c)) {
					answer += map.get(c);
				}
			}
			
			sb.append(answer).append("\n");
		}
		System.out.print(sb);
	}
}

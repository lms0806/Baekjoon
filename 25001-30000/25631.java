import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		HashMap<Integer, Integer> map = new HashMap<>();
		
		int t = Integer.parseInt(br.readLine());
		
		int answer = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		while(t --> 0) {
			int n = Integer.parseInt(st.nextToken());
			
			map.put(n, map.containsKey(n) ? map.get(n) + 1 : 1);
			
			answer = Math.max(answer, map.get(n));
		}
		System.out.print(answer);
	}
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int solveproblem = 0, solvetotaltime = 0;
		HashMap<Character, Integer> map = new HashMap<>();
		while(true) {
			String s = br.readLine();
			
			if(s.equals("-1")) {
				break;
			}
			
			StringTokenizer st = new StringTokenizer(s);
			
			int time = Integer.parseInt(st.nextToken());
			char problem = st.nextToken().charAt(0);
			String result = st.nextToken();
			
			if(result.equals("wrong")) {
				map.put(problem, map.getOrDefault(problem, 0) + 1);
			}
			else {
				solveproblem++;
				solvetotaltime += time + (map.containsKey(problem) ? map.get(problem) * 20 : 0);
			}
		}
		System.out.print(solveproblem + " " + solvetotaltime);
	}
}

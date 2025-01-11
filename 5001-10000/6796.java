import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		HashMap<Character, Integer> map = new HashMap<>();
		map.put('A', 0);
		map.put('B', 0);
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int choice = Integer.parseInt(st.nextToken());
			
			if(choice == 7) {
				break;
			}
			
			char c = st.nextToken().charAt(0);
			switch(choice) {
				case 1:
					map.put(c, Integer.parseInt(st.nextToken()));
					break;
				case 2:
					sb.append(map.get(c)).append("\n");
					break;
				case 3:
					map.put(c, map.get(c) + map.get(st.nextToken().charAt(0)));
					break;
				case 4:
					map.put(c, map.get(c) * map.get(st.nextToken().charAt(0)));
					break;
				case 5:
					map.put(c, map.get(c) - map.get(st.nextToken().charAt(0)));
					break;
				case 6:
					map.put(c, map.get(c) / map.get(st.nextToken().charAt(0)));
			}
		}
		System.out.print(sb);
	}
}

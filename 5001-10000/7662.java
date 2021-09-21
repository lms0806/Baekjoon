import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int size = Integer.parseInt(br.readLine());

		StringBuilder sb = new StringBuilder();
		while (size-- > 0) {
			TreeMap<Integer, Integer> map = new TreeMap<>();
			int num = Integer.parseInt(br.readLine());

			while (num --> 0) {
				StringTokenizer st = new StringTokenizer(br.readLine());

				char ch = st.nextToken().charAt(0);
				int n = Integer.parseInt(st.nextToken());

				if (ch == 'I') {
					map.put(n, !map.containsKey(n) ? 1 : 1 + map.get(n));
				} 
				else if (!map.isEmpty() && ch == 'D') {
					int number = n == 1 ? map.lastKey() : map.firstKey();
					
					if (map.get(number) == 1) {
						map.remove(number);
					} 
					else {
						map.put(number, map.get(number) - 1);
					}
				}
			}
			if (map.isEmpty()) {
				sb.append("EMPTY");
			} 
			else {
				sb.append(map.lastKey()).append(" ").append(map.firstKey());
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}

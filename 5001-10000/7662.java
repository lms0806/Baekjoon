import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(size-->0) {
			TreeMap<Integer, Integer> map = new TreeMap<>();
			int num = Integer.parseInt(br.readLine());
			while(num-->0) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				if(st.nextToken().equals("I")) {
					int number = Integer.parseInt(st.nextToken());
					map.put(number, !map.containsKey(number) ? 1 : 1 + map.get(number));
				}
				else {
					if(map.isEmpty()) {
						continue;
					}
					if(st.nextToken().equals("1")) {
						int max = map.lastKey();
						if(map.get(max) == 1) {
							map.remove(max);
						}
						else {
							map.put(max, map.get(max)-1);
						}
					}
					else {
						int min = map.firstKey();
						if(map.get(min) == 1) {
							map.remove(min);
						}
						else {
							map.put(min, map.get(min)-1);
						}
					}
				}
			}
			if(map.isEmpty()) {
				sb.append("EMPTY").append("\n");
			}
			else {
				sb.append(map.lastKey()).append(" ").append(map.firstKey()).append("\n");;
			}
		}
		System.out.print(sb);
	}
}

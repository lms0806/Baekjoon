import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			int n = Integer.parseInt(br.readLine());
			
			if(n == 0) {
				break;
			}
			
			TreeMap<String, Integer> price = new TreeMap<>(), days = new TreeMap<>();
			
			while(n --> 0) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				String s = st.nextToken();
				
				price.put(s, Integer.parseInt(st.nextToken()));
				days.put(s, Integer.parseInt(st.nextToken()));
			}
			
			int t = Integer.parseInt(br.readLine());
			
			int countstar = 0;
			while(t --> 0) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				int number = Integer.parseInt(st.nextToken());
				int call = Integer.parseInt(st.nextToken());
				int waitday = Integer.parseInt(st.nextToken());
				
				int sum = 0, start = 0;
				while(call --> 0) {
					String s = br.readLine();
					if(days.get(s) <= waitday) {
						sum += price.get(s);
					}
					else {
						start = 1;
					}
				}
				
				if(start == 1) {
					countstar++;
				}
				
				sb.append(number).append(" ").append(sum).append(" ").append(start == 1 ? "*" : "").append("\n");
			}
			sb.append("Number of discontented customers is: ").append(countstar).append("\n");
		}
		System.out.print(sb);
	}
}

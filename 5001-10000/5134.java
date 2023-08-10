import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		StringBuilder answer = new StringBuilder();
		for(int t = 1; t <= size; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
			
			HashMap<String, Integer> count = new HashMap<>();
			HashMap<String, Double> map = new HashMap<>();
			for(int i = 0; i < n; i++) {
				st = new StringTokenizer(br.readLine());
				int counts = Integer.parseInt(st.nextToken());
				
				double num = stringToDouble(st.nextToken()) - stringToDouble(st.nextToken());
				
				StringBuilder sb = new StringBuilder();
				while(st.hasMoreTokens()) {
					sb.append(st.nextToken().toLowerCase());
				}
				
				count.put(sb.toString(), counts);
				map.put(sb.toString(), num);
			}
			
			double result = 0;
			while(m --> 0) {
				st = new StringTokenizer(br.readLine());
				
				int countm = Integer.parseInt(st.nextToken());
				
				StringBuilder sb = new StringBuilder();
				while(st.hasMoreTokens()) {
					sb.append(st.nextToken().toLowerCase());
				}
				
				if(map.containsKey(sb.toString())) {
					result += Math.min(countm, count.get(sb.toString())) * map.get(sb.toString());
				}
			}
			
			answer.append("Data Set ").append(t).append(":\n$").append(String.format("%.2f", result)).append("\n\n");
		}
		System.out.print(answer);
	}
	
	public static double stringToDouble(String s) {
		return Double.parseDouble(s.substring(1));
	}
}

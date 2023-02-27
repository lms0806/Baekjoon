import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		String s = br.readLine();
		
		int t = Integer.parseInt(br.readLine());
		
		double max = 0;
		LinkedHashMap<String, Double> map = new LinkedHashMap<>();
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			String str = st.nextToken();
			double n = Double.parseDouble(st.nextToken());
			
			int idx = 0;
			for(char c : str.toCharArray()) {
				if(c == s.charAt(idx)) {
					idx++;
				}
				
				if(idx == s.length()) {
					n /= str.length() - s.length();
					
					max = Math.max(max, n);
					map.put(str, n);
					break;
				}
			}
		}
		
		if(map.size() == 0) {
			System.out.print("No Jam");
		}
		else {
			for(String key : map.keySet()) {
				if(map.get(key) == max) {
					System.out.print(key);
					break;
				}
			}
		}
	}
}

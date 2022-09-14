import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		HashMap<String, Double> map = new HashMap<>();
		
		String s;
		int count = 0;
		while((s = br.readLine()) != null) {
			if(s.equals("1")) {
				break;
			}
			
			map.put(s, map.containsKey(s) ? map.get(s) + 1 : 1);
			count++;
		}
		
		double num = 0.0;
		for(String key : map.keySet()) {
			num += Math.pow(map.get(key) / count, 2);
		}
		System.out.print(1.0 - num);
	}
}

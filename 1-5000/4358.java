import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		HashMap<String, Integer> map = new HashMap<>();
		
		String str = "";
		int count = 0;
		while((str = br.readLine()) != null) {
			map.put(str, !map.containsKey(str) ? 1 : map.get(str) + 1);
			count++;
		}
		
		Object[] k = map.keySet().toArray();
		Arrays.sort(k);
		
		StringBuilder sb = new StringBuilder();
		for(Object o : k) {
			String key = (String) o;
			sb.append(key).append(" ").append(String.format("%.4f", (double)(map.get(key)*100)/count)).append("\n");
		}
		System.out.print(sb);
	}
}

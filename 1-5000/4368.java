import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		HashMap<String, String> map = new HashMap<>();
		
		while(true) {
			String str = br.readLine();
			
			if(str.equals("")) {
				break;
			}
			
			String[] strs = str.split(" ");
			map.put(strs[1], strs[0]);
		}
		
		String s;
		StringBuilder sb = new StringBuilder();
		while((s = br.readLine()) != null) {
			sb.append(map.containsKey(s) ? map.get(s) : "eh").append("\n");
		}
		System.out.print(sb);
	}
}

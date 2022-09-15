import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		HashMap<String, String> map = new HashMap<>();
		
		int t = Integer.parseInt(br.readLine());
		
		ArrayList<String> arr = new ArrayList<>();
		while(t --> 0) {
			String s = br.readLine();
			
			char[] board = s.toCharArray();
			
			Arrays.sort(board);
			
			String check = new String(board);
			if(!map.containsKey(check)) {
				arr.add(s);
				map.put(check, s);
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(String s : arr) {
			sb.append(s).append("\n");
		}
		System.out.print(sb);
	}
}

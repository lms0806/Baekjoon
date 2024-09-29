import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			String s = br.readLine();
			
			ArrayList<String> arr = new ArrayList<>();
			for(int i = 0; i < s.length(); i++) {
				arr.add(s.substring(i) + s.substring(0, i));
			}
			
			Collections.sort(arr);
			
			sb.append(arr.get(0)).append("\n");
		}
		System.out.print(sb);
	}
}

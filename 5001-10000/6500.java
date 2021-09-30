import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringBuilder sb = new StringBuilder();
		while(true) {
			int n = Integer.parseInt(br.readLine());
			
			if(n == 0) {
				break;
			}
			
			ArrayList<Integer> arr = new ArrayList<>();
			while(true) {
				if(arr.contains(n)) {
					break;
				}
				
				arr.add(n);
				
				String s = Integer.toString((int) Math.pow(n, 2));
				
				while(s.length() != 8) {
					s = "0" + s;
				}
				
				n = Integer.parseInt(s.substring(2, 6));
			}
			sb.append(arr.size()).append("\n");
		}
		System.out.print(sb);
	}
}

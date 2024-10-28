import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		ArrayList<String> arr = new ArrayList<>();
		while(t --> 0) {
			String s = br.readLine();
			
			arr.add(s.contains("rest") ? "😎" : s.contains("leg") ? "🦵" : "💪");
		}
		
		int num = 0, idx = 0, count = 1;
		StringBuilder sb = new StringBuilder();
		while(num < 31) {
			if(num % 7 == 0) {
				if(num != 0) {
					sb.append("\n");
				}
				sb.append(count++).append(" ");
			}
			sb.append(arr.get(idx++));
			
			num++;
			idx %= arr.size();
		}
		System.out.print(sb);
	}
}

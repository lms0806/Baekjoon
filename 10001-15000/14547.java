import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str;
		StringBuilder sb = new StringBuilder();
		while(!(str = br.readLine()).equals("#")) {
			String s = str.split(" ")[1];
			
			ArrayList<Character> arr = new ArrayList<>();
			for(int i = 1; i < s.length(); i++) {
				if(s.charAt(i - 1) == s.charAt(i) && !arr.contains(s.charAt(i))) {
					arr.add(s.charAt(i));
				}
			}
			
			for(int i = 0; i < arr.size(); i++) {
				sb.append(arr.get(i)).append(" ").append(arr.get(i)).append(" glued");
				if(i < arr.size() - 1) {
					sb.append(" and ");
				}
			}
			
			if(arr.size() != 0) {
				sb.append("\n");
			}
		}
		System.out.print(sb);
	}
}

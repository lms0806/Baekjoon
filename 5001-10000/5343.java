import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			String s = br.readLine();
			
			int answer = 0;
			for(int i = 0; i < s.length(); i+= 8) {
				String str = s.substring(i, i + 7);
				
				int count = 0;
				for(char c : str.toCharArray()) {
					if(c == '1') {
						count++;
					}
				}
				
				if(count % 2 == 0 && s.charAt(i + 7) == '1') {
					answer++;
				}
				else if(count % 2 == 1 && s.charAt(i + 7) == '0') {
					answer++;
				}
			}
			
			sb.append(answer).append("\n");
		}
		System.out.print(sb);
	}
}

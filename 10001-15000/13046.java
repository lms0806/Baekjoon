import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			String str = br.readLine();
			
			int a = 0, b = 0;
			for(int i = 0; i < s.length(); i++) {
				if(s.charAt(i) == str.charAt(i)) {
					a++;
				}
				else {
					for(int j = 0; j < s.length(); j++) {
						if(s.charAt(j) == str.charAt(i)) {
							b++;
						}
					}
				}
			}
			
			sb.append(a).append(" ").append(b).append("\n");
		}
		System.out.print(sb);
	}
}

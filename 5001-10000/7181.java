import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		String s = br.readLine();
		
		boolean[] num = new boolean[10];
		for(char c : s.toCharArray()) {
			num[c - '0'] = true;
		}
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			String str = br.readLine();
			
			int a = 0, b = 0;
			
			for(int i = 0; i < s.length(); i++) {
				if(num[str.charAt(i) - '0']) {
					a++;
				}
				if(s.charAt(i) == str.charAt(i)) {
					b++;
				}
			}
			
			sb.append(a).append(" ").append(b).append("\n");
		}
		System.out.print(sb);
	}
}

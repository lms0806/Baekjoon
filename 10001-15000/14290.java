import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder answer = new StringBuilder();
		for(int i = 1; i <= t; i++) {
			String s = br.readLine();
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()) - 1, b = Integer.parseInt(st.nextToken()) - 1;
			
			int idx = 0, which = 0, count = 0;
			while(which < b + 1) {
				if(s.charAt(idx) == 'B' && which >= a && which <= b) {
					count++;
				}
				idx++;
				which++;
				
				if(s.length() == idx) {
					idx = 0;
				}
			}
			
			answer.append("Case #").append(i).append(": ").append(count).append("\n");
		}
		System.out.print(answer);
	}
}

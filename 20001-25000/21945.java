import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		long answer = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		while(size --> 0) {
			String s = st.nextToken();
			
			boolean b = true;
			for(int i = 0; i < s.length() / 2 ; i++) {
				if(s.charAt(i) != s.charAt(s.length() - i - 1)) {
					b = false;
					break;
				}
			}
			
			if(b) {
				answer += Integer.parseInt(s);
			}
		}
		System.out.print(answer);
	}
}

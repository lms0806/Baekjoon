import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		String[] s = new String[n];
		
		for(int i = 0; i < s.length; i++) {
			s[i] = br.readLine();
		}
		
		int answer = 0;
		while(m --> 0) {
			String str = br.readLine();
			
			for(String a : s) {
				if(a.startsWith(str)) {
					answer++;
					break;
				}
			}
		}
		System.out.print(answer);
	}
}

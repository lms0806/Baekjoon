import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		boolean b = true;
		int max = 0;
		String answer = "";
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine().replaceAll("[^a-z,A-Z,\\-, ]", ""));
			
			while(st.hasMoreTokens()) {
				String s = st.nextToken();
				if(s.equals("E-N-D")) {
					b = false;
					break;
				}
				if(max < s.length()) {
					answer = s;
					max = s.length();
				}
			}
			
			if(!b) {
				break;
			}
		}
		
		System.out.print(answer.toLowerCase());
	}
}

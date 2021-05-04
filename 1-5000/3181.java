import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String[] s = {"I","PA","TE","NI","NITI","A","ALI","NEGO","NO","ILI"};
		
		String answer = st.nextToken().toUpperCase().substring(0,1);
		while(st.hasMoreTokens()) {
			boolean b = true;
			String str = st.nextToken().toUpperCase();
			
			for(int i = 0; i < s.length; i++) {
				if(str.equals(s[i])) {
					b = false;
					break;
				}
			}
			
			if(!b) {
				continue;
			}
			
			answer += str.substring(0,1);
		}
		System.out.print(answer);
	}
}

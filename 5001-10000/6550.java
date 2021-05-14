import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		String str = "";
		
		StringBuilder sb = new StringBuilder();
		while((str = br.readLine()) != null) {
			StringTokenizer st = new StringTokenizer(str);
			
			String s = st.nextToken();
			String t = st.nextToken();
			
			int count = 0;
			boolean istrue = false;
			for(int i = 0; i < s.length(); i++) {
				istrue = false;
				for(int j = count; j < t.length(); j++) {
					if(s.charAt(i) == t.charAt(j)) {
						count = j+1;
						istrue = true;
						break;
					}
				}
				if(!istrue) {
					break;
				}
			}
			sb.append(istrue ? "Yes" : "No").append("\n");
		}
		System.out.print(sb);
	}
}

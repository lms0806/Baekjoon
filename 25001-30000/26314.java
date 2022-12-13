import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			int ja = 0, mo = 0;
			
			String s = br.readLine();
			for(char c : s.toCharArray()) {
				if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
					mo++;
				}
				else {
					ja++;
				}
			}
			
			sb.append(s).append("\n").append(mo - ja > 0 ? 1 : 0).append("\n");
		}
		System.out.print(sb);
	}
}	

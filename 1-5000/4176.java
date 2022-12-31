import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			String s = br.readLine();
			
			if(s.equals("END")) {
				break;
			}
			
			String t = s;
			
			int count = 0;
			while(true) {
				count++;
				s = String.valueOf(s.length());
				
				if(s.equals(t)) {
					break;
				}
				
				t = s;
			}
			
			sb.append(count).append("\n");
		}
		System.out.print(sb);
	}
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
	    
		StringBuilder sb = new StringBuilder();
		while(true) {
			String s = br.readLine();
			
			if(s.equals("#")) {
				break;
			}
			
			int num = 0;
			for(int i = s.length() - 1; i >= 0; i--) {
				num += (s.charAt(i) - '0') * (s.length() - i + 1);
			}
			
			num = 11 - num % 11;
			
			sb.append(s).append(" -> ").append(num == 10 ? "Rejected" : num == 11 ? 0 : num).append("\n");
        }
		System.out.print(sb);
	}
}

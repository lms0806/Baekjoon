import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			String s = br.readLine();
			
			String a = s.substring(0, s.length() / 3 + (s.length() % 3 == 0 ? 0 : 1));
			
			if(s.equals(a + new StringBuilder(a).reverse().toString() + a)) {
				sb.append(1);
			}
			else if(s.equals(a + new StringBuilder(a).reverse().toString().substring(1) + a)) {
				sb.append(1);
			}
			else if(s.equals(a + new StringBuilder(a).reverse().toString() + a.substring(1))){
				sb.append(1);
			}
			else if(s.equals(a + new StringBuilder(a).reverse().toString().substring(1) + a.substring(1))) {
				sb.append(1);
			}
			else {
				sb.append(0);
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}

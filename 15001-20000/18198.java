import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		String s = br.readLine();
		int a = 0, b = 0;
		
		boolean flag = false;
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < s.length(); i++) {
			if(a == 10 && b == 10) {
				flag = true;
			}
			
			if(!flag) {
				if(a >= 11) {
					sb.append("A");
					break;
				}
				else if(b >= 11) {
					sb.append("B");
					break;
				}
			}
			
			if(s.charAt(i) == 'A') {
				a += (s.charAt(i + 1) - '0');
			}
			else if(s.charAt(i) == 'B'){
				b += (s.charAt(i + 1) - '0');
			}
			
			if(flag) {
				if(a - b >= 2) {
					sb.append("A");
					break;
				}
				else if(b - a >= 2) {
					sb.append("B");
					break;
				}
			}
		}
		System.out.print(sb);
	}
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
	
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			String s = br.readLine() + " ";
			
			int count = 1;
			char c = s.charAt(0);
			for(int i = 1; i < s.length(); i++) {
				if(c != s.charAt(i)) {
					sb.append(count).append(" ").append(c).append(" ");
					count = 1;
					c = s.charAt(i);
				}
				else {
					count++;
				}
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}

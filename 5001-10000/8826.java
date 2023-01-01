import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
	    
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			br.readLine();
			
			int x = 0, y = 0;
			for(char c : br.readLine().toCharArray()) {
				if(c == 'E') {
					y--;
				}
				else if(c == 'W') {
					y++;
				}
				else if(c == 'N') {
					x--;
				}
				else if(c == 'S') {
					x++;
				}
			}
			
			sb.append(Math.abs(x) + Math.abs(y)).append("\n");
		}
		System.out.print(sb);
	}
}

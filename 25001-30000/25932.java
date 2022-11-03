import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			boolean mack = false, zack = false;
			for(int i = 0; i < 10; i++) {
				int n = Integer.parseInt(st.nextToken());
				
				if(n == 17) {
					zack = true;
				}
				if(n == 18) {
					mack = true;
				}
				
				sb.append(n).append(" ");
			}
			
			sb.append("\n").append(mack && zack ? "both" : mack ? "mack" : zack ? "zack" : "none").append("\n\n");
		}
		System.out.print(sb);
	}
}

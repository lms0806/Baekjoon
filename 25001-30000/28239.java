import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			long n = Long.parseLong(br.readLine());
			
			if(Long.bitCount(n) % 2 == 0) {
				for(int i = 0; i < 64; i++) {
					if((n & (1L << i)) != 0) {
						sb.append(i).append(" ");
					}
				}
				sb.append("\n");
			}
			else {
				for(int i = 0; i < 64; i++) {
					if((n & (1L << i)) != 0) {
						sb.append(i - 1).append(" ").append(i - 1).append("\n");
						break;
					}
				}
			}
		}
		System.out.print(sb);
	}
}

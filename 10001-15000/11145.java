import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
	
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			String s = br.readLine().trim();
			
			try {
				if(s.contains("-") || s.contains("+")) {
					sb.append("invalid input");
				}
				else {
					sb.append(new BigInteger(s));
				}
			}
			catch(Exception e){
				sb.append("invalid input");
			}
			
			sb.append("\n");
		}
		System.out.print(sb);
	}
}

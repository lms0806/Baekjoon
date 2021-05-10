import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			String str = br.readLine();
			
			if(str.equals("***")) {
				break;
			}
			
			for(int i = str.length()-1; i >= 0; i--) {
				sb.append(str.charAt(i));
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}

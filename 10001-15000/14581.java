import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		String str = br.readLine();
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 9; i++) {
			sb.append(":");
			if(i == 4) {
				sb.append(str);
			}
			else {
				sb.append("fan");
			}
			sb.append(":");
			
			if(i%3 == 2) {
				sb.append("\n");
			}
		}
		System.out.print(sb);
	}
}

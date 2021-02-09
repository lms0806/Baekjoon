import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < size; i++) {
			String str = br.readLine();
			
			if((str.charAt(str.length()-1)-'0')%2 != 0) {
				sb.append("odd").append("\n");
			}
			else {
				sb.append("even").append("\n");
			}
		}
		System.out.print(sb);
	}
}

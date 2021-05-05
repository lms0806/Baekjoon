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
			
			if(str.charAt(str.length()/2) == str.charAt(str.length()/2-1)) {
				sb.append("Do-it");
			}
			else {
				sb.append("Do-it-Not");
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}

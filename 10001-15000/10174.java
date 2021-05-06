import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < size; i++) {
			boolean istrue = true;
			String str = br.readLine().toLowerCase();
			
			for(int j = 0; j < str.length(); j++) {
				if(str.charAt(j) != str.charAt(str.length() - j - 1)) {
					istrue = false;
					break;
				}
			}
			sb.append(istrue ? "Yes" : "No").append("\n");
		}
		System.out.print(sb);
	}
}

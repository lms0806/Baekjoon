import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		String[] db = {"@   @"
				, "@  @"
				, "@@@"
				, "@  @"
				, "@   @"};
		int n = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < n; j++) {
				for(int k = 0; k < db[i].length(); k++) {
					for(int w = 0; w < n; w++) {
						sb.append(db[i].charAt(k));
					}
				}
				sb.append("\n");
			}
		}
		System.out.print(sb);
	}
}

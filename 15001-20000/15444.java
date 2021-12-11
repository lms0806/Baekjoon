import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		String[][] s = {{"***", "*.*", "***", "*.*", "*.*"},
				{"***", "*.*", "***", "*.*", "***"},
				{"***", "*..", "*..", "*..", "***"},
				{"***", "*.*", "*.*", "*.*", "***"},
				{"***", "*..", "***", "*..", "***"}};

		br.readLine();
		String str = br.readLine();
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 5; i++) {
			for(char c : str.toCharArray()) {
				sb.append(s[c - 'A'][i]);
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}

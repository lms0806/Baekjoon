import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

		int size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= size; i++) {
			String str = br.readLine();
			
			sb.append("String #").append(i).append("\n");
			for(char ch : str.toCharArray()) {
				sb.append(ch+1 == 91 ? 'A' : (char)(ch+1));
			}
			sb.append("\n\n");
		}
		System.out.print(sb);
	}
}

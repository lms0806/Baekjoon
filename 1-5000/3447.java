import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		String str = "";
		
		StringBuilder sb = new StringBuilder();
		while((str = br.readLine()) != null) {
			while(str.contains("BUG")) {
				str = str.replace("BUG", "");
			}
			sb.append(str).append("\n");
		}
		System.out.print(sb);
	}
}

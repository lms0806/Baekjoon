import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		String s = "";
		StringBuilder sb = new StringBuilder();
		while((s = br.readLine()) != null) {
			sb.append(s.replaceAll("da+dd?(i|y)", "").length() == 0 ? "She called me!!!" : "Cooing").append("\n");
		}
		System.out.print(sb);
	}
}

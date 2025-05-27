import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s = br.readLine() + br.readLine();
		
		System.out.print("HECP".equals(s) || "EHPC".equals(s) || "CHPE".equals(s) || "HCEP".equals(s) || "PCEH".equals(s) || "EPHC".equals(s) || "PECH".equals(s) || "CPHE".equals(s) ? "YES" : "NO");
	}
}

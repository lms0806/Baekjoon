import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
	
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= t; i++) {
			String a = change(br.readLine()), b = change(br.readLine());
		
			sb.append("Data Set ").append(i).append(": ").append(a.equals(b) ? "equal" : "not equal").append("\n\n");
		}
		System.out.print(sb);
	}
	
	public static String change(String s) {
		s = s.toLowerCase();
		
		s = s.replaceAll("[\\[\\{]", "(").replaceAll("[\\]\\}]", ")").replaceAll("\\;", "\\,");
		
		s = s.replaceAll("\\s+", " ");
		
		s = s.replaceAll("(\\s)\\1+", "$1").replaceAll("\\s*(\\(|\\[|\\{|\\)|\\]|\\}|\\.|\\,|\\;|\\:)\\s*", "$1");
		
		return s;
	}
}

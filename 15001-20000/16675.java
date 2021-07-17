import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String a = st.nextToken(), b = st.nextToken();
		String c = st.nextToken(), d = st.nextToken();
		
		String answer = "?";
		if(a.equals(b)) {
			if(a.equals("P") && (c.equals("S") || d.equals("S"))) {
				answer = "TK";
			}
			else if(a.equals("S") && (c.equals("R") || d.equals("R"))) {
				answer = "TK";
			}
			else if(a.equals("R") && (c.equals("P") || d.equals("P"))) {
				answer = "TK";
			}
		}
		
		if(c.equals(d)) {
			if(c.equals("P") && (a.equals("S") || b.equals("S"))) {
				answer = "MS";
			}
			else if(c.equals("S") && (a.equals("R") || b.equals("R"))) {
				answer = "MS";
			}
			else if(c.equals("R") && (a.equals("P") || b.equals("P"))) {
				answer = "MS";
			}
		}
		
		System.out.print(answer);
	}
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		String str = "";
		StringBuilder sb = new StringBuilder();
		while(!(str = br.readLine().toLowerCase()).equals("*")) {
			boolean istrue = true;
			
			StringTokenizer st = new StringTokenizer(str);
			char ch = st.nextToken().charAt(0);
			while(st.hasMoreTokens()) {
				if(st.nextToken().charAt(0) != ch) {
					istrue = false;
					break;
				}
			}
			
			sb.append(istrue ? "Y" : "N").append("\n");
		}
		System.out.print(sb);
	}
}

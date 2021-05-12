import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String a = st.nextToken();
		String check = st.nextToken();
		String b = st.nextToken();
		
		System.out.print(check.equals("AND") ? a.equals("true") && a.equals(b) ? true : false : a.equals("true") || b.equals("true") ? true : false);
	}
}

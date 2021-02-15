import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String a = st.nextToken();
		String b = st.nextToken();
		
		System.out.print((min(a) + min(b)) + " " + (max(a) + max(b)));
	}
	
	public static int min(String str) {
		return Integer.parseInt(str.replaceAll("6", "5"));
	}
	
	public static int max(String str) {
		return Integer.parseInt(str.replaceAll("5", "6"));
	}
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int x = rev(Integer.parseInt(st.nextToken())), y = rev(Integer.parseInt(st.nextToken()));

		System.out.println(rev(x + y));
	}
	
	public static int rev(int n) {
		return Integer.parseInt(new StringBuilder(String.valueOf(n)).reverse().toString());
	}
}

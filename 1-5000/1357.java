import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int x = rev(Integer.parseInt(st.nextToken()));
		int y = rev(Integer.parseInt(st.nextToken()));
		
		int answer = rev(x+y);
		
		System.out.println(answer);
	}
	
	public static int rev(int n) {
		StringBuilder sb = new StringBuilder(String.valueOf(n));
		
		return Integer.parseInt(sb.reverse().toString());
	}
}

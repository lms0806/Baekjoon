import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		double a = Double.parseDouble(st.nextToken()), b = Double.parseDouble(st.nextToken()), c = Double.parseDouble(st.nextToken());
		
		System.out.print((long)Math.max(a * b / c, a / b * c));
	}
}

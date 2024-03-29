import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken()), c = Integer.parseInt(st.nextToken());
		
        	StringBuilder sb = new StringBuilder();
		sb.append((a + b) % c).append("\n").append(((a % c) + (b % c)) % c).append("\n").append((a * b) % c).append("\n").append(((a % c) * (b % c)) %c);
		System.out.print(sb);
	}
}

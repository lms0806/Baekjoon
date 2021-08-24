import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long r = Long.parseLong(st.nextToken()), c = Long.parseLong(st.nextToken()), n = Long.parseLong(st.nextToken());
		
		long a = r % n == 0 ? r / n : r / n + 1;
		long b = c % n == 0 ? c / n : c / n + 1;
		
		System.out.print(a * b);
	}
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{ 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		double time = m * 100.0 / n * 14.4;
		
		System.out.print(print((int) (time / 60)) + ":" + print((int) (time % 60)));
	}
	
	public static String print(int num) {
		return String.format("%02d", num);
	}
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken()), h = Integer.parseInt(st.nextToken());
		int l = Integer.parseInt(st.nextToken());
		
		System.out.print(Math.min(n, (w / l) * (h / l)));
	}
}

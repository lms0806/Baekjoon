import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int r = Integer.parseInt(st.nextToken()), c = Integer.parseInt(st.nextToken());
		
		System.out.print(r > c ? (c - 1) * 2 + 1 : (r - 1) * 2);
	}
}

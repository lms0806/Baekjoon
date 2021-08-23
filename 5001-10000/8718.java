import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int x = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());

		System.out.print(k * 7 <= x ? k * 7000 : k * 3.5 <= x ? k * 3500 : k * 1.75 <= x ? k * 1750 : 0);
	}
}

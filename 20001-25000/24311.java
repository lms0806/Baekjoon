import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int t = Integer.parseInt(st.nextToken()) * 60 + Integer.parseInt(st.nextToken()) - 10;
		t -= Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine());
		t -= Integer.parseInt(st.nextToken()) * 60 + Integer.parseInt(st.nextToken());
		
		t -= (Integer.parseInt(br.readLine()) + 1) * Integer.parseInt(br.readLine());
		
		System.out.print(String.format("%02d", t / 60) + " " + String.format("%02d", t % 60));
	}
}

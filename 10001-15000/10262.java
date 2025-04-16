import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int ga = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()), gb = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int ea = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()), eb = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
		
		System.out.print(ga - ea + gb - eb > 0 ? "Gunnar" : ga - ea + gb - eb == 0 ? "Tie" :"Emma");
	}
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int d = Integer.parseInt(st.nextToken()) * 24 * 60;
		int h = Integer.parseInt(st.nextToken()) * 60;
		int m = Integer.parseInt(st.nextToken());
		
		int answer = d + h + m - (11 * 60 * 24 + 11 * 60 + 11);
		
		System.out.print(answer < 0 ? -1 : answer);
	}
}

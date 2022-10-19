import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int y = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		int answer = (y == 0 ? 15 * m : y == 1 ? 15 * 12 + 9 * m : 15* 12 + 9 * 12 + (y - 2) * 4 * 12 + 4 * m);
		
		System.out.print(answer / 12 + " " + answer % 12);
	}
}

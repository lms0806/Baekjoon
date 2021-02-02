import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		String line = "";
		while((line = br.readLine()) != null) {
			StringTokenizer st = new StringTokenizer(line);
			
			int n = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
			
			int answer = n;
			
			while(n/k != 0) {
				answer += n/k;
				n = n/k + n%k;
			}
			System.out.println(answer);
		}
	}
}

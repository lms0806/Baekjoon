import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		int n,m,u = 0, t = 0;
		
		int size = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < size; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			n = Integer.parseInt(st.nextToken());
			m = Integer.parseInt(st.nextToken());
			
			u = m*2-n;
			t = m-u;
			System.out.println(u + " " + t);
		}
		br.close();
	}
}

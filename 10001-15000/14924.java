import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int x = Integer.parseInt(st.nextToken());
		int l = Integer.parseInt(st.nextToken());
		int r = Integer.parseInt(st.nextToken());
		
		int answer = r / (x*2);
		answer *= l;
		System.out.println(answer);
	}
}

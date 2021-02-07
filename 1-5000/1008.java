import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		double answer;
		answer = Integer.parseInt(st.nextToken());
		answer /= Integer.parseInt(st.nextToken());
		
		System.out.println(answer);
	}
}

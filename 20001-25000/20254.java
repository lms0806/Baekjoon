import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());

		System.out.println(Integer.parseInt(st.nextToken()) * 56 + Integer.parseInt(st.nextToken()) * 24 + Integer.parseInt(st.nextToken()) * 14 + Integer.parseInt(st.nextToken()) * 6);
	}
}

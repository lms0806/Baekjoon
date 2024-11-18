import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print(sum(br.readLine()) > sum(br.readLine()) + 1.5 ? "cocjr0208" : "ekwoo");
	}
	
	public static double sum(String s) {
		StringTokenizer st = new StringTokenizer(s);
		return Integer.parseInt(st.nextToken()) * 13 + Integer.parseInt(st.nextToken()) * 7 + Integer.parseInt(st.nextToken()) * 5 + Integer.parseInt(st.nextToken()) * 3 + Integer.parseInt(st.nextToken()) * 3 + Integer.parseInt(st.nextToken()) * 2; 
	}
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		double remain = (180.0 / Double.parseDouble(st.nextToken()) * Double.parseDouble(st.nextToken())) % 360;
		
		System.out.print(remain < 90.0 || remain > 270.0 ? "up" : "down");
	}
}

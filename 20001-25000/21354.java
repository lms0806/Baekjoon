import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken()) * 7, b = Integer.parseInt(st.nextToken()) * 13;
		
		System.out.print(a > b ? "Axel" : a == b ? "lika" : "Petra");
	}
}

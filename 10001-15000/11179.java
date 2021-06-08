import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		String s = Integer.toBinaryString(Integer.parseInt(br.readLine()));
		
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();
		
		System.out.print(Integer.parseInt(sb.toString(), 2));
	}
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(size --> 0) {
			String s = br.readLine();
			sb.append(Character.toString(s.charAt(0)).toUpperCase()).append(s.substring(1)).append("\n");
		}
		System.out.print(sb);
	}
}

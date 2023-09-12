import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int t = 1; t <= size; t++) {			
			sb.append("Case #").append(t).append(": ").append(print(Integer.parseInt(br.readLine()))).append("\n");
		}
		System.out.print(sb);
	}
	
	public static String print(int n) {
		if(n <= 25) {
			return "World Finals";
		}
		
		return "Round " + (n <= 1000 ? 3 : n <= 4500 ? 2 : 1); 
	}
} 

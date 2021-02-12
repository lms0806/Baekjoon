import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		String[] strs = br.readLine().split(" ");
		
		System.out.print(Integer.parseInt(strs[0]) + Integer.parseInt(strs[2]) == Integer.parseInt(strs[4])? "YES" : "NO");
	}
}

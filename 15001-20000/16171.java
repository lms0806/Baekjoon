import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		String str = br.readLine().replaceAll("[0-9]", "");
		String strs = br.readLine();
		
		System.out.print(str.indexOf(strs) != -1 ? 1 : 0);
	}
}

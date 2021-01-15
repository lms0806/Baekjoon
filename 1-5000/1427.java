import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

		String str = br.readLine();
		String[] strs = str.split("");
		
		Arrays.sort(strs);
		
		for(int i = strs.length-1; i >= 0; i--) {
			System.out.print(strs[i]);
		}
	}
}

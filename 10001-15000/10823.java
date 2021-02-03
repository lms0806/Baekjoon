import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		String line = "", str = "";
		
		while((line = br.readLine()) != null) {
			str += line;
		}
		
		String[] strs = str.split(",");
		
		int sum = 0;
		for(int i = 0; i < strs.length; i++) {
			sum += Integer.parseInt(strs[i]);
		}
		
		System.out.println(sum);
	}
}

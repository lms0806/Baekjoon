import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
	
		int k = Integer.parseInt(br.readLine());
		
		String a = br.readLine(), b = br.readLine();
		
		int same = 0, not = 0;
		for(int i = 0; i < a.length(); i++) {
			if(a.charAt(i) == b.charAt(i)) {
				same++;
			}
			else {
				not++;
			}
		}
		System.out.print(Math.min(k, same) + Math.min(not, a.length() - k));
	}
}

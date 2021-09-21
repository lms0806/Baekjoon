import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int size = Integer.parseInt(br.readLine()) + 1;
		
		while(true) {
			if(solve(Integer.toString(size))) {
				break;
			}
			
			size++;
		}
		System.out.print(size);
	}
	
	public static boolean solve(String str) {
		for(int i = 0; i < str.length(); i++) {
			for(int j = 0; j < str.length(); j++) {
				if(i != j && str.charAt(i) == str.charAt(j)) {
					return false;
				}
			}
		}
		return true;
	}
}

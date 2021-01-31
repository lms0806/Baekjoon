import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int num = Integer.parseInt(br.readLine());
		String str = br.readLine();
		
		int a = 0, b = 0;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == 'A') {
				a++;
			}
			else {
				b++;
			}
		}
		
		if(a > b) {
			System.out.print("A");
		}
		else if(a == b) {
			System.out.println("Tie");
		}
		else {
			System.out.println("B");
		}
	}
}

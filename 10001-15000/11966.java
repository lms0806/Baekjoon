import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int num = Integer.parseInt(br.readLine());
		boolean check = false;
		
		if(num == 1) {
			System.out.println("1");
		}
		else {
			for(int i = 0; i < 30; i++) {
				if(num == Math.pow(2, i+1)) {
					check = true;
					break;
				}
			}
			if(check) {
				System.out.println("1");
			}
			else {
				System.out.println("0");
			}
		}
	}
}

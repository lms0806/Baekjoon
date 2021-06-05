import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		System.out.print(solve(Integer.parseInt(br.readLine())));
	}
	
	public static int solve(int num) {
		int n = 2, count = 1;
		
		if(num == 1) {
			return 1;
		}
		else {
			while(n <= num) {
				n += count * 6;
				count++;
			}
			return count;
		}
	}
}

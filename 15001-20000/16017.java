import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int[] num = new int[4];
		for(int i = 0; i < 4; i++) {
			num[i] = Integer.parseInt(br.readLine());
		}
		
		System.out.print(solve(num));
	}
	
	public static String solve(int[] num) {
		if((num[0] == 8 || num[0] == 9) && (num[3] == 8 || num[3] == 9) && (num[1] == num[2])) {
			return "ignore";
		}
		return "answer";
	}
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print(solve(Integer.parseInt(br.readLine())));
	}
	
	public static String solve(int n) {
		HashSet<Integer> set = new HashSet<>();

		while(true) {
			set.add(n);
			
			int num = 0;
			while(n != 0) {
				num += Math.pow(n % 10, 2);
				n /= 10;
			}
			
			if(num == 1) {
				return "HAPPY";
			}
			
			if(set.contains(num)) {
				return "UNHAPPY";
			}
			set.add(num);
			
			n = num;
		}
	}
}

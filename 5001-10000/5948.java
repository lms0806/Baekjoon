import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		HashSet<Integer> set = new HashSet<>();
		
		int answer = 0;
		while(true) {
			if(set.contains(n)) {
				break;
			}
			set.add(n);
			
			int num = n / 100 % 10 * 10 + n / 10 % 10;
			num *= num;
			
			answer++;
			
			n = num;
		}
		System.out.print(answer);
	}
}

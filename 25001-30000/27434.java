import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		System.out.print(solve(1, Integer.parseInt(br.readLine())));
	}

	public static BigInteger solve(int a, int b){
		if(b - a < 10){
			BigInteger answer = BigInteger.ONE;
			for(int i = a; i <= b; i++){
				answer = answer.multiply(BigInteger.valueOf(i));
			}
			return answer;
		}
		int mid = a + (b - a) / 2;
		return solve(a, mid).multiply(solve(mid + 1, b));
	}
}

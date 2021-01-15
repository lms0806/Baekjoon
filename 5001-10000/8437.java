import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		BigInteger a = new BigInteger(br.readLine());
		BigInteger b = new BigInteger(br.readLine());
		BigInteger div = BigInteger.TWO;
		
		BigInteger answer1 = a.add(b).divide(div);
		BigInteger answer2 = a.subtract(b).divide(div);
		
		System.out.println(answer1 + "\n" + answer2);

		br.close();
	}
}

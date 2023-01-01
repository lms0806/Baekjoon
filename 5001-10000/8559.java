import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
	    
        String s = br.readLine();
		if(s.equals("0")) {
			System.out.print(1);
		}
		else {
			BigInteger n = new BigInteger(s).remainder(new BigInteger("4"));
			
			int[] num = {6,2,4,8};
			System.out.print(num[n.intValue()]);
		}
	}
}

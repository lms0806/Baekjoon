import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int t = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        while(t --> 0) {
        	BigInteger n = new BigInteger(br.readLine());
        	BigInteger origin = n;
        	
        	sb.append(n).append("\n");
        	while(n.compareTo(new BigInteger("100")) >= 0) {
        		BigInteger sub = n.remainder(BigInteger.TEN);
            	
            	n = n.divide(BigInteger.TEN);
            	
            	n = n.subtract(sub);
            	
            	sb.append(n).append("\n");
        	}
        	
        	sb.append("The number ").append(origin).append(" is ").append(n.remainder(BigInteger.valueOf(11)).compareTo(BigInteger.ZERO) == 0 ? "" : "not ").append("divisible by 11.").append("\n\n");
        }
        System.out.print(sb);
    }
}

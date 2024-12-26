import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringBuilder sb = new StringBuilder();
        while(true) {
        	int n = Integer.parseInt(br.readLine());
        	
        	if(n == 0) {
        		break;
        	}
        	
        	br.readLine();
        	
        	BigInteger num = BigInteger.ONE;
        	for(int i = 2; i <= n; i++) {
        		num = num.multiply(BigInteger.valueOf(i));
        	}
        	
        	int[] arr = new int[10];
        	while(num.compareTo(BigInteger.ZERO) != 0) {
        		arr[Integer.parseInt(num.remainder(BigInteger.TEN).toString())]++;
        		num = num.divide(BigInteger.TEN);
        	}
        	
        	sb.append(String.format("%d! --\n", n));
        	for(int i = 0; i < 10; i++) {
        		if(i == 5) {
        			sb.append("\n");
        		}
        		
        		sb.append(String.format("   (%d) % 4d ", i, arr[i]));
        	}
        	sb.append("\n");
        }
        System.out.print(sb);
    }
}

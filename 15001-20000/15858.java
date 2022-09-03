import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		BigDecimal a = new BigDecimal(st.nextToken()), b = new BigDecimal(st.nextToken()), c = new BigDecimal(st.nextToken());
		
        System.out.print(a.multiply(b).divide(c, 6, RoundingMode.HALF_EVEN));
	}
}

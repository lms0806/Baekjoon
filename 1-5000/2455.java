import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

		int num = 0, sum = 0;
		for(int i = 0; i < 4; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			sum = sum - Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
			if(sum > num) {
				num = sum;
			}
		}
		System.out.print(num);
	}
}

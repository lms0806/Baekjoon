import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		int result = 0;
		if(a == b && b == c) {
			result = 10000 + a * 1000;
		}
		else if(a == b) {
			result = 1000 + a * 100;
		}
		else if(b == c) {
			result = 1000 + b * 100;
		}
		else if(a == c) {
			result = 1000 + c * 100;
		}
		else {
			if(a > b && a > c) {
				result = a * 100;
			}
			else {
				if(b > c) {
					result = b * 100;
				}
				else {
					result = c * 100;
				}
			}
		}
		System.out.println(result);
	}
}

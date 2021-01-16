import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < size; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int num = Integer.parseInt(st.nextToken());
			int[] number = new int[num];
			for(int j = 0; j < num; j++) {
				number[j] = Integer.parseInt(st.nextToken());
			}
			
			long sum = 0;
			for(int j = 0; j < num-1; j++) {
				for(int k = j+1; k < num; k++) {
					sum += gcd(number[j],number[k]);
				}
			}
			System.out.println(sum);
		}
	}
	
	public static int gcd(int a, int b) {
		if(b == 0) {
			return a;
		}
		return gcd(b, a%b);
	}
}

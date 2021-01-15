import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		int a, b;
		
		int min = 1, num = 0;
		for(int i = 0; i < size; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			if(a > b) {
				num = b;
			}
			else {
				num = a;
			}
			for(int j = 1; j <= num; j++) {
				if(a%j==0 && b%j==0) {
					min = j;
				}
			}
			System.out.println(a*b/min);
			min = 1;
		}
	}
}

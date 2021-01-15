import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		int a, b;
		
		int m = 2, min = 1;
		for(int i = 0; i < size; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			while(m<=a && m<=b) {
				if(a%m==0 && b%m==0) {
					min = m;
				}
				m++;
			}
			System.out.println(a*b/min);
			min = 1;
			m = 2;
		}
	}
}

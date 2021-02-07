import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		int n = 0, sum = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < size; i++) {
			int a = Integer.parseInt(st.nextToken());
			if(a == 1) {
				if(n != 0) {
					n++;
					sum += n;
				}
				else {
					n++;
					sum += n;
				}
			}
			else {
				n = 0;
			}
		}
		
		System.out.println(sum);
	}
}

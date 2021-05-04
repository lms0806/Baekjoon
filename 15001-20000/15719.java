import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		boolean[] b = new boolean[size];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		while(st.hasMoreTokens()) {
			int num = Integer.parseInt(st.nextToken());
			if(!b[num]) {
				b[num] = true;
			}
			else {
				System.out.print(num);
				break;
			}
		}
	}
}

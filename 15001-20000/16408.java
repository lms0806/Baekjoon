import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] b = new int[37];
		
		for(int i = 0; i < 5; i++) {
			int num = st.nextToken().charAt(0)-'0';
			b[num]++;
		}
		
		int num = 0;
		for(int i = 0; i < b.length; i++) {
			if(b[i] != 0) {
				num = Math.max(num, b[i]);
			}
		}
		System.out.print(num);
	}
}

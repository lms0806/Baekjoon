import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		String[] str = br.readLine().split("-");
		
		int sum = 0;
		for(int i = 0; i < str.length; i++) {
			int temp = 0;
			
			StringTokenizer st = new StringTokenizer(str[i], "+");
			while(st.hasMoreTokens()) {
				temp += Integer.parseInt(st.nextToken());
			}
			
			sum += i == 0 ? temp : -temp;
		}
		
		System.out.print(sum);
	}
}

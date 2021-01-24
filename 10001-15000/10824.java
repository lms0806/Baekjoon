import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String str = st.nextToken() + st.nextToken();
		String str1 = st.nextToken() + st.nextToken();
		
		long num = Long.parseLong(str);
		long num1 = Long.parseLong(str1);
		
		long answer = num + num1;
		
		System.out.println(answer);
	}
}

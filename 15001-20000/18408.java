import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] num = new int[2];
		
		for(int i = 0; i < 3; i++) {
			num[Integer.parseInt(st.nextToken())-1]++;
		}
		
		
		System.out.println((num[0] > num[1]) ? 1 : 2);
	}
}

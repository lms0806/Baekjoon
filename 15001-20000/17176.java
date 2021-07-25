import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		int[] num = new int[53];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		while(size --> 0) {
			num[Integer.parseInt(st.nextToken())]++;
		}
		
		int[] result = new int[53];
		for(char ch : br.readLine().toCharArray()) {
			result[ch == ' ' ? 0 : ch >= 'A' && ch <= 'Z' ? ch - 'A' + 1 : ch - 'a' + 27]++;
		}
		
		boolean b = true;
		for(int i = 0; i < num.length; i++) {
			if(num[i] != result[i]) {
				b = false;
				break;
			}
		}
		
		System.out.print(b ? "y" : "n");
	}
}

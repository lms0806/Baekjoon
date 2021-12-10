import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int n = Integer.parseInt(br.readLine());
		
		int[] num = new int[1001];
		
		while(n --> 0) {
			num[Integer.parseInt(br.readLine())]++;
		}
		
		int max = 0;
		for(int i = 1; i < num.length; i++) {
			if(max < num[i]) {
				max = num[i];
			}
		}
		System.out.print(max);
	}
}

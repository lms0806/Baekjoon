import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

		int size = Integer.parseInt(br.readLine());
		int[] num = new int[size];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < size; i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}
		
		System.out.print(solve(num));
	}
	
	public static String solve(int[] num) {
		int count = 0;
		for(int i = 1; i < num.length; i++) {
			if(num[i - 1] < num[i]) {
				if(count == -1) {
					return "NO";
				}
				count++;
			}
			else if(num[i-1] == num[i]) {
				return "NO";
			}
			else {
				count = -1;
			}
		}
		return "YES";
	}
}

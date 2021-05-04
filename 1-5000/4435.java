import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int[] a = {1,2,3,3,4,10};
		int[] b = {1,2,2,2,3,5,10};
		
		int size = Integer.parseInt(br.readLine());
		
		int first = 0, second = 0;
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < size*2; i++) {
			if(i%2 == 0) {
				first = whiles(br.readLine(), a);
			}
			else {
				second = whiles(br.readLine(), b);
				
				sb.append("Battle " ).append(i/2 + 1).append(": ").append(first > second ? "Good triumphs over Evil" : first == second ? "No victor on this battle field" : "Evil eradicates all trace of Good").append("\n");
			}
		}
		System.out.print(sb);
	}
	
	public static int whiles(String str, int[] arr) {
		StringTokenizer st = new StringTokenizer(str);
		
		int num = 0, count = 0;
		
		while(st.hasMoreTokens()) {
			num += Integer.parseInt(st.nextToken()) * arr[count];
			count++;
		}
		return num;
	}
}

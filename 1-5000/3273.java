import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
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
		
		int n = Integer.parseInt(br.readLine());
		
		Arrays.sort(num);
		
		int answer = 0;
		int start = 0, end = size - 1;
		while(start < end) {
			int check = num[start] + num[end];
			
			if(check == n) {
				answer++;
			}
			
			if(check <= n) {
				start++;
			}
			else {
				end--;
			}
		}
		System.out.print(answer);
	}
}

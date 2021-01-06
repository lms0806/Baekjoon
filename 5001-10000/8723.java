import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] num = new int[3];
		
		for(int i = 0; i < 3; i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(num);
		
		int count = 0;
		
		if(num[0] == num[1] && num[1] == num[2]) {
			count = 2;
		}
		else if(Math.pow(num[2], 2) == Math.pow(num[1], 2) + Math.pow(num[0], 2)) {
			count = 1;
		}
		
		System.out.println(count);
	}
}

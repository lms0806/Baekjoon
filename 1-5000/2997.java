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
		
		int answer = 0;
		if(num[1] - num[0] == num[2] - num[1]) {
			answer = num[2] + num[2] - num[1];
		}
		else if(num[1] - num[0] < num[2] - num[1]) {
			answer = num[1] + num[1] - num[0];
		}
		else {
			answer = num[0] + num[2] - num[1];
		}
		
		System.out.println(answer);
	}
}

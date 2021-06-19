import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int size = Integer.parseInt(st.nextToken()), number = Integer.parseInt(st.nextToken());
		
		int[] num = new int[size];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < size; i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}
		
		System.out.print(solve(num, number));
	}
	
	public static int solve(int[] num, int number) {
		int answer = 0;
		
		for(int i = 0; i < num.length - 2; i++) {
			for(int j = i + 1; j < num.length - 1; j++) {
				for(int k = j + 1; k < num.length; k++) {
					int temp = num[i] + num[j] + num[k];
					
					if(temp == number) {
						return temp;
					}
					if(answer < temp && temp < number) {
						answer = temp;
					}
				}
			}
		}
		return answer;
	}
}

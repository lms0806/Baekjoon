import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		int[] num = new int[size], numbers = new int[8001];
		
		int sum = 0;
		for(int i = 0; i < size; i++) {
			num[i] = Integer.parseInt(br.readLine());
			numbers[num[i] + 4000]++;
			sum += num[i];
		}
		
		Arrays.sort(num);
		
		StringBuilder sb = new StringBuilder();
		
		sb.append((int)Math.round((double)sum / size)).append("\n");
		
		sb.append(num[size / 2]).append("\n");
		
		int answer = 0, max = 0, count = 0;
		for(int i = 0; i < numbers.length; i++) {
			if(max < numbers[i]) {
				answer = i - 4000;
				max = numbers[i];
				count = 0;
			}
			else if(max == numbers[i] && count < 1) {
				answer = i - 4000;
				count++;
			}
		}
		sb.append(answer).append("\n");
		
		sb.append(num[size - 1] - num[0]);
		
		System.out.print(sb);
	}
}

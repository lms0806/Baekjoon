import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		int[] num = new int[size];
		
		for(int i = 0; i < size; i++) {
			num[i] = Integer.parseInt(br.readLine());
		}
		
		System.out.print(num[1] - num[0] == num[2] - num[1] ? num[size - 1] + (num[1] - num[0]) : num[size - 1] * (num[1] / num[0]));
	}
}

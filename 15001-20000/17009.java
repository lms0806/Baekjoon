import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

		int[] num = new int[2];
		
		for(int i = 0; i < 2; i++) {
			num[i] += Integer.parseInt(br.readLine()) * 3 + Integer.parseInt(br.readLine()) * 2 + Integer.parseInt(br.readLine());
		}
		
		System.out.print(num[0] > num[1] ? "A" : num[0] == num[1] ? "T" : "B");
	}
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		int left = 0, right = 0;
		int check = 0;
		
		int[] num = new int[size];
		for(int i = 0; i < size; i++) {
			num[i] = Integer.parseInt(br.readLine());
			if(check < num[i]) {
				left++;
				check = num[i];
			}
		}
		
		check = 0;
		for(int i = size - 1; i >= 0; i--) {
			if(num[i] > check) {
				check = num[i];
				right++;
			}
		}
		System.out.println(left + "\n" + right);
	}
}

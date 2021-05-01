import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int[] count = new int[4];
		int number = Integer.parseInt(br.readLine());
		for(int i = 0; i < 3; i++) {
			int num = Integer.parseInt(br.readLine());
			if(number > num) {
				count[0]++;
			}
			else if(number == num) {
				count[1]++;
			}
			else {
				count[2]++;
			}
			number = num;
		}
		System.out.print(count[0] == 3 ? "Fish Diving" : count[1] == 3 ? "Fish At Constant Depth" : count[2] == 3 ? "Fish Rising" : "No Fish");
	}
}

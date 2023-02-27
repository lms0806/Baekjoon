import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
        int[] number = new int[10];
		ArrayList<Integer> arr = new ArrayList<>();
		for(int i = 1; i < 26195084; i++) {
			Arrays.fill(number, 0);
			
			int num = i;
			
			while(num != 0) {
				number[num % 10]++;
				num /= 10;
			}
			
			if(check(number)) {
				arr.add(i);
			}
		}
		
		StringBuilder sb = new StringBuilder();
		while(true) {
            int n = Integer.parseInt(br.readLine());
			
			if(n == 0) {
				break;
			}
			
			sb.append(arr.get(n - 1)).append("\n");
		}
		System.out.print(sb);
	}
	
	public static boolean check(int[] num) {
		for(int i = 0; i < num.length; i++) {
			if(num[i] > 1) {
				return false;
			}
		}
		return true;
	}
}

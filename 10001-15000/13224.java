import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;


public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int[] num = {1, 2, 3};
		
		int temp = 0;
		for(char ch : br.readLine().toCharArray()) {
			if(ch == 'A') {
				temp = num[0];
				num[0] = num[1];
				num[1] = temp;
			}
			else if(ch == 'B') {
				temp = num[1];
				num[1] = num[2];
				num[2] = temp;
			}
			else {
				temp = num[0];
				num[0] = num[2];
				num[2] = temp;
			}
		}
		
		for(int i = 0; i < 3; i++) {
			if(num[i] == 1) {
				System.out.print(i + 1);
				break;
			}
		}
	}
}

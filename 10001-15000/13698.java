import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int[] arr = {1, 0, 0, 2};
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		for(char c : br.readLine().toCharArray()) {
			if(c == 'A') {
				change(0, 1);
			}
			else if(c == 'B') {
				change(0, 2);
			}
			else if(c == 'C') {
				change(0, 3);
			}
			else if(c == 'D') {
				change(1, 2);
			}
			else if(c == 'E') {
				change(1, 3);
			}
			else {
				change(2, 3);
			}
		}
		
		int n = 0, m = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == 1) {
				n = i + 1;
			}
			if(arr[i] == 2) {
				m = i + 1;
			}
		}
		System.out.print(n + "\n" + m);
	}
	
	public static void change(int x, int y) {
		int temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
	}
}

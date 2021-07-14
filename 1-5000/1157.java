import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int[] arr = new int[26];
		
		for(char ch : br.readLine().toCharArray()) {
			if(ch < 91) {
				arr[ch - 65]++;
			}
			else {
				arr[ch - 97]++;
			}
		}
		
		int max = 0, ch = -2;
		for(int i = 0; i < 26; i++) {
			if(arr[i] > max) {
				max = arr[i];
				ch = i;
			}
			else if(arr[i] == max){
				ch = -2;
			}
		}
		
		System.out.print((char)(ch + 65));
	}
}

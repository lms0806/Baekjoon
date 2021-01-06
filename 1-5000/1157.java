import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		String a = br.readLine().toUpperCase();
		int[] arr = new int[26];
		
		for(int i = 0; i < a.length(); i++) {
			arr[a.charAt(i) - 'A']++;
		}
		
		int max = 0;
		char answer = '?';
		
		for(int i = 0; i < 26; i++) {
			if(arr[i] > max) {
				max = arr[i];
				answer = (char)(i+65);
			}
			else if(arr[i] == max){
				answer = '?';
			}
		}
		
		System.out.println(answer);
	}
}

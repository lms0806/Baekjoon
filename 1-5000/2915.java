import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

		String[] a = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
		String[] b = {"X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
		
		String[] result = new String[128];
		
		for(int i = 0; i < a.length; i++) {
			int idx = change(a[i]);
			
			if(result[idx] == null) {
				result[idx] = a[i];
			}
		}
		
		for(int i = 0; i < b.length; i++) {
			for(int j = 0; j < a.length; j++) {
				int idx = change(b[i] + a[j]);
				
				if(result[idx] == null) {
					result[idx] = b[i] + a[j];
				}
			}
		}
		
		System.out.print(result[change(br.readLine())]);
	}
	
	public static int change(String s) {
		int sum = 0;
		for(char c : s.toCharArray()) {
			sum += c == 'I' ? 1 : c == 'X' ? 4 : c == 'V' ? 16 : c == 'L' ? 32 : 64;
		}
		return sum;
	}
}

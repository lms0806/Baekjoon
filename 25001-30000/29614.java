import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		String s = br.readLine();
		
		int count = 0;
		double sum = 0;
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == 'A') {
				if(check(s, i)) {
					sum += 4.5;
					i++;
				}
				else {
					sum += 4;
				}
			}
			else if(s.charAt(i) == 'B') {
				if(check(s, i)) {
					sum += 3.5;
					i++;
				}
				else {
					sum += 3;
				}
			}
			else if(s.charAt(i) == 'C') {
				if(check(s, i)) {
					sum += 2.5;
					i++;
				}
				else {
					sum += 2;
				}
			}
			else if(s.charAt(i) == 'D') {
				if(check(s, i)) {
					sum += 1.5;
					i++;
				}
				else {
					sum += 1;
				}
			}
			count++;
		}
		
		System.out.print(sum / count);
	}
	
	public static boolean check(String s, int idx) {
		if(idx < s.length() - 1 && s.charAt(idx + 1) == '+') {
			return true;
		}
		return false;
	}
}

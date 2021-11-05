import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		System.out.print(solve(br.readLine()));
	}
	
	public static String solve(String s) {
		boolean check = "qwertasdfgzxcvb".contains(s.charAt(0) + "") ? true : false;
		for(int i = 1; i < s.length(); i++) {
			char ch = s.charAt(i);
			if(!check && "qwertasdfgzxcvb".contains(ch + "")) {
				check = true;
			}
			else if(check && "yuiophjklnm".contains(ch + "")) {
				check = false;
			}
			else {
				return "no";
			}
		}
		return "yes";
	}
}

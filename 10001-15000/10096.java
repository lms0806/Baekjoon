import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		System.out.print(slove());
	}
	
	public static String slove() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		br.readLine();
		String str = br.readLine();
		
		if(str.length()%2 == 0) {
			return "NOT POSSIBLE";
		}
		
		int i = 0;
		for(i = 0; i < str.length(); i++) {
			if(str.charAt(0) != str.charAt(i)) {
				break;
			}
		}
		
		int len = str.length()/2;
		
		if(i == str.length()) {
			return str.substring(0, len);
		}//다같은거 체크
		
		if(str.substring(0, len).equals(str.substring(len, str.length()-1)) && str.substring(1, len + 1).equals(str.substring(len + 1))){
			return "NOT UNIQUE";
		}
		
		for(i = 0; i < len; i++) {
			if(str.charAt(i) != str.charAt(len + 1 + i)) {
				if(str.substring(i + 1, len + 1).equals(str.substring(len + 1 + i))) {
					return str.substring(len + 1);
				}
				else {
					break;
				}
			}
		}
		
		if(i == len) {
			return str.substring(0, len);
		}
		
		for(i = 0; i < len; i++) {
			if(str.charAt(i) != str.charAt(len + i)) {
				if(str.substring(i, len).equals(str.substring(len + 1 + i))) {
					return str.substring(0,len);
				}
				else {
					return "NOT POSSIBLE";
				}
			}
		}
		
		if(i == len) {
			return str.substring(0, len);
		}
		
		return null;
	}
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		String[] alpha = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		int[] num = new int[alpha.length];
		
		String[] str = br.readLine().split("");
		for(int i = 0; i < str.length; i++) {
			for(int j = 0; j < alpha.length; j++) {
				if(str[i].equals(alpha[j]) && num[j] == 0) {
					num[j] = i+1;
					break;
				}
			}
		}
		
        	StringBuilder sb = new StringBuilder();
		for(int i = 0; i < num.length; i++) {
			sb.append(num[i]-1).append(" ");
		}
        	System.out.print(sb);
	}
}

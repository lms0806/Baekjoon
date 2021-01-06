import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		String str = "";
		String[] check = {"-","\\","(","@","?",">","&","%","/",};
		
		while(!str.equals("#")) {
			str = br.readLine();
			if(str.equals("#")) {
				break;
			}
			String[] strs = str.split("");
			
			int pow = 0, num = 0, sum = 0;;
			for(int i = 0; i < strs.length; i++) {
				pow = (int)Math.pow(8, strs.length-i-1);
				for(int j = 0; j < check.length; j++) {
					if(strs[i].equals(check[j])) {
						if(j == check.length-1) {
							num = -1;
						}
						else {
							num = j;
						}
					}
				}
				sum += pow*num;
			}
			System.out.println(sum);
		}
	}
}

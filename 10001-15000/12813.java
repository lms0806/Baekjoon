import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
        String s = br.readLine();
		String t = br.readLine();
		StringBuilder and = new StringBuilder(), or = new StringBuilder(), xor = new StringBuilder(), nota = new StringBuilder(), notb = new StringBuilder();
		
		for(int i = 0; i < s.length(); i++) {
            int a = s.charAt(i)-'0';
            int b = t.charAt(i)-'0';
            
            and.append(a & b);
            or.append(a | b);
            xor.append(a ^ b);
            nota.append(a == 0 ? 1 : 0);
            notb.append(b == 0 ? 1 : 0);
        }
		
        System.out.print(and + "\n" + or + "\n" + xor + "\n" + nota + "\n" + notb);
	}
}

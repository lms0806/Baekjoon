import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	String s = br.readLine();
    	
    	System.out.print(s.contains("(") ? s.substring(0, s.indexOf("(")) + "\n" + s.substring(s.indexOf("(") + 1, s.length() - 1) : s + "\n-");
    }
}

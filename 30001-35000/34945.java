import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
        System.out.print(Integer.parseInt(br.readLine()) > 5 ? "Success!" : "Oh My God!");
	}
}

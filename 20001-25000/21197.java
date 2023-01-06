import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        if(n % 2 == 1) {
        	System.out.print("still running");
        }
        else {
        	int sum = 0;
        	for(int i = 0; i < n; i += 2) {
        		sum = sum - Integer.parseInt(br.readLine()) + Integer.parseInt(br.readLine());
        	}
        	System.out.print(sum);
        }
    }
}

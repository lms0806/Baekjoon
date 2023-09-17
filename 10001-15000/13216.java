import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String s = br.readLine();
        
        int idx = 0;
        int a = 0, b = 0;
        StringBuilder sb = new StringBuilder();
        while(idx != s.length()){
        	int costa = 0, costb = 0;
        	
        	while(costa != 21 && costb != 21) {
        		if(s.charAt(idx) == 'A') {
        			costa++;
        		}
        		else {
        			costb++;
        		}
        		
        		idx++;
        	}
        	
        	if(costa > costb) {
        		a++;
        	}
        	else {
        		b++;
        	}
        	
        	sb.append(costa).append("-").append(costb).append("\n");
        }
        System.out.print(sb + (a > b ? "A" : "B"));
    }
}

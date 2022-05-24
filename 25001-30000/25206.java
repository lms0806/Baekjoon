import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        double sum = 0.0, scoresum = 0.0;
        for(int i = 0; i < 20; i++) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	st.nextToken();
        	double score = Double.parseDouble(st.nextToken());
        	String check = st.nextToken();
        	
        	if(!check.equals("P")) {
        		sum += score * checkscore(check);
            	scoresum += score;
        	}
        }
        System.out.print(sum / scoresum);
    }
    
    public static double checkscore(String s) {
    	switch(s) {
    		case "A+":
    			return 4.5;
    		case "A0":
    			return 4.0;
    		case "B+":
    			return 3.5;
    		case "B0":
    			return 3.0;
    		case "C+":
    			return 2.5;
    		case "C0":
    			return 2.0;
    		case "D+":
    			return 1.5;
    		case "D0":
    			return 1.0;
    		default:
    			return 0.0;
    	}
    }
}

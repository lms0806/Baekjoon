import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		
		String[] numbers = new String[size];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < size; i++) {
			numbers[i] = st.nextToken();
		}
        
        System.out.print(solve(numbers));
	}
	
	public static String solve(String[] str) {
        Arrays.sort(str, new Comparator<String>() {
            public int compare(String a, String b){
                return (b+a).compareTo(a+b);
            }
        });
        
        if(str[0].equals("0")){
            return "0";
        }
	    
        String answer = "";
        for(String s : str){
            answer += s;
        }
        
        return answer;
	}
}

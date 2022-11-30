import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		HashSet<String> set = new HashSet<String>(Arrays.asList("ChongChong"));
		
		int t = Integer.parseInt(br.readLine());
		
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			String a = st.nextToken(), b = st.nextToken();
			
			if(set.contains(b)) {
				set.add(a);
			}
            if(set.contains(a)){
                set.add(b);
            }
		}
		
		System.out.print(set.size());
	}
}

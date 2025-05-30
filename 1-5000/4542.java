import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			int n = Integer.parseInt(br.readLine());
			
			String[] str = new String[n];
			for(int i = 0; i < n; i++) {
				str[i] = br.readLine();
			}
			
			sb.append(solve(str)).append("\n");
		}
		System.out.print(sb);
	}
	
	private static String solve(String[] str) {
        for (int l = 60; l > 2; l--) {
            Set<String> set = new TreeSet<>();
            for (int i = 0; i <= 60 - l; i++) {
                String sub = str[0].substring(i, i + l);
                boolean flag = true;
                for (int j = 1; j < str.length; j++) {
                    if (!str[j].contains(sub)) {
                    	flag = false;
                        break;
                    }
                }
                
                if (flag) {
                    set.add(sub);
                }
            }
            
            if (!set.isEmpty()) {
                return set.iterator().next();
            }
        }

        return "no significant commonalities";
    }
}

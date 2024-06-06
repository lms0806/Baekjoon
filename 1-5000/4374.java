import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String input;
		Pattern pattern = Pattern.compile("[a-z]+");
		StringBuilder answer = new StringBuilder();
		while((input = br.readLine()) != null) {
			int n = Integer.parseInt(input);
			
			String line = br.readLine();
			Map<String, Integer> map = new TreeMap<>();
			while(!line.equals("EndOfText")) {
				Matcher matcher = pattern.matcher(line.toLowerCase());
				
                while (matcher.find()) {
                    String word = matcher.group();
                    map.put(word, map.getOrDefault(word, 0) + 1);
                }
                
                line = br.readLine();
			}
			
			StringBuilder sb = new StringBuilder();
			for(String key : map.keySet()) {
				if(map.get(key) == n) {
					sb.append(key).append("\n");
				}
			}
			
			if(sb.length() == 0) {
				sb.append("There is no such word.").append("\n");
			}
			
			answer.append(sb).append("\n");
		}
		System.out.print(answer);
	}
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String [] INITIAL_STRING = {"ㄱ", "ㄲ", "ㄴ", "ㄷ", "ㄸ", "ㄹ", "ㅁ", "ㅂ", "ㅃ", "ㅅ", "ㅆ", "ㅇ", "ㅈ", "ㅉ", "ㅊ", "ㅋ", "ㅌ", "ㅍ", "ㅎ" };
		
		StringBuilder sb = new StringBuilder();
		for(char c : br.readLine().toCharArray()) {
			int unicode = c - 0xAC00;
            sb.append(INITIAL_STRING[((unicode - (unicode % 28)) / 28) / 21]);
		}
		System.out.print(sb);
	}
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		br.readLine();
		String s = br.readLine();
		String s1 = s.replaceAll("bigdata", "");
		
		int bigdata = (s.length() - s1.length()) / 7;
		int security = s1.length() / 8;
		
		System.out.print(bigdata > security ? "bigdata?" : bigdata == security ? "bigdata? security!" : "security!");
	}
}

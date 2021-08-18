import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Base64;
import java.util.Base64.Decoder;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Decoder decoder = Base64.getDecoder();
		byte[] encodedBytes = decoder.decode(br.readLine().getBytes());
		
		System.out.print(new String(encodedBytes));
	}
}

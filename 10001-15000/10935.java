import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Base64;
import java.util.Base64.Encoder;;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Encoder encoder = Base64.getEncoder();
		byte[] encodedBytes = encoder.encode(br.readLine().getBytes());
		
		System.out.print(new String(encodedBytes));
	}
}

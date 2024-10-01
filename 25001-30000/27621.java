import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		long[][] arr = {{0, 0, 0}, {0, 0, 1}, {0, 1, 1}, {1, 1, 1}, {}, {}, {-1, -1, 2}, {0, -1, 2}, {0, 0, 2}, {0, 1, 2}, {1, 1, 2}, {-2, -2, 3}, {7, 10, -11}, {}, {}, {-1, 2, 2}, {-511, -1609, 1626}, {1, 2, 2}, {-1, -2, 3}, {0, -2, 3}, {1, -2, 3}, {-11, -14, 16}, {}, {}, {-2901096694l, -15550555555l, 15584139827l}, {-1, -1, 3}, {0, -1, 3}, {0, 0, 3}, {0, 1, 3}, {1, 1, 3}, {-283059965, -2218888517l, 2220422932l}, {}, {}, {8866128975287528l, -8778405442862239l, -2736111468807040l}, {-1, 2, 3}, {0, 2, 3}, {1, 2, 3}, {0, -3, 4}, {1, -3, 4}, {117367, 134476, -159380}, {}, {}, {-80538738812075974l, 80435758145817515l, 12602123297335631l}, {2, 2, 3}, {-5, -7, 8}, {2, -3, 4}, {-2, 3, 3}, {6, 7, -8}, {-23, -26, 31}, {}};
		
		int n = Integer.parseInt(br.readLine());
		
		System.out.print(arr[n].length == 0 ? 0 : arr[n][0] + " " + arr[n][1] + " " + arr[n][2]);
	}
}

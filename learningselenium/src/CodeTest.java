import java.util.Arrays;
import java.util.List;

public class CodeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//		int x=2;
//		int y =x-- *2+ --x;
//		System.out.println(y);

		String[] name = { "Nitesh", "Kumar" };
		//convert array in arraylist using Arrays.asList()
		
		//arrayList not support index 
		
		List<String> namelist = Arrays.asList(name);

		for (String name1 : namelist) {
			System.out.println(name1);

		}

	}
}

import java.util.Hashtable;


public class Samochody2mvn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		my_interface Interf = new my_interface();
		Samochod tablica;

		Hashtable<String, Integer> map = Interf.getUserOrder();
		int sum = 0;
		for (int f : map.values()) {
		    sum += f;
		}
		FabrykaSamochodow fabs = new FabrykaSamochodow(sum);
		fabs.stworzSamochody(map);
		Iterator iter = fabs.getIterator();

		do
		{
		tablica = iter.next();
		tablica.wypiszSam();
		System.out.println();
		}while(iter.hasNext());
		
	}
}

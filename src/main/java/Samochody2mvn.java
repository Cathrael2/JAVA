import java.util.Hashtable;


public class Samochody2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Fabryka fabryka = new Fabryka();
		
		my_interface Interf = new my_interface();
		Samochod tablica;
		/*message my_mess = new message(Interf.getUserOrder().toString());
		my_mess.show_mess();*/
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
		

		/*Samochod tablica;
		System.out.println();
		System.out.println();
		System.out.println();
		Hashtable<String, Integer> map = new Hashtable<String, Integer>();
		map.put("TYP1", 1);
		map.put("TYP5", 3);
		map.put("TYP3", 5);
		fabs.stworzSamochody(map);
		Iterator iter = fabs.getIterator();

		do
		{
		tablica = iter.next();
		tablica.wypiszSam();
		System.out.println();
		}while(iter.hasNext());
*/
		
	}
}

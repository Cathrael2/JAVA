
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Hashtable;

public class my_interface {
	private List<String> modele;
	private List<String> wersje;
	private int count;
	private String u_model;
	private String u_wersja;
	
	public my_interface()
	{
		modele = new ArrayList<String>();
		modele.add("Atos");
		modele.add("Portos");
		modele.add("Aramis");
		
		wersje = new ArrayList<String>();
		wersje.add("Sportowa");
		wersje.add("Ekonomiczna");
	}
	
	private int getChoiceInt()
	{
		message tmp_mess = new message();
		int tmp_int = 0;
		Scanner odczyt = new Scanner(System.in);
		
		while(tmp_int < 1)
		{
			tmp_int = odczyt.nextInt();
			if(tmp_int < 1)
			{
				tmp_mess.set_message("Wybierz prawid³ow¹ opcjê");
				tmp_mess.show_mess();
			}
		}
		
		return tmp_int;
	}
	
	private String getChoiceString(List<String> tmp)
	{
		message tmp_mess = new message();
		String tmp_str;
		Scanner odczyt = new Scanner(System.in);
		
		breakloop1:
			while(true)
			{
				
				tmp_str = odczyt.nextLine();
				
				for(Iterator it = tmp.iterator(); it.hasNext(); )
				{
					if(tmp_str.equals(it.next()))
						break breakloop1;
				}
				
				tmp_mess.set_message("Wybierz prawdid³ow¹ opcje");
				tmp_mess.show_mess();
			}
		
		return tmp_str;
	}
	
	private void getUserChoice()
	{
		message tmp_mess = new message();
		
		System.out.println(Arrays.toString(modele.toArray()));
		
		u_model = getChoiceString(modele);
		
		tmp_mess.set_message("Wybierz wersje:");
		tmp_mess.show_mess();
		
		System.out.println(Arrays.toString(wersje.toArray()));
		
		u_wersja = getChoiceString(wersje);
		
		tmp_mess.set_message("Podaj iloœæ:");
		tmp_mess.show_mess();
		
		count = getChoiceInt();
	}
	
	public Hashtable<String, Integer> getUserOrder()
	{
		Hashtable<String, Integer> ret_hash = new Hashtable<String, Integer>();
		message tmp_mess = new message("Witaj w naszej fabryce.\nWybierz model samochodu:");
		String odp;
		List<String> yes_no = new ArrayList<String>();
		
		yes_no.add("Tak");
		yes_no.add("Nie");
		
		tmp_mess.show_mess();
		
		do{
			getUserChoice();
			
			if(u_model.equals(modele.get(0)))
			{
				if(u_wersja.equals(wersje.get(0)))
				{
					ret_hash.put("TYP1", count);
				}
				else
				{
					ret_hash.put("TYP2", count);
				}
			}
			else if(u_model.equals(modele.get(1)))
			{
				if(u_wersja.equals(wersje.get(0)))
				{
					ret_hash.put("TYP3", count);
				}
				else
				{
					ret_hash.put("TYP4", count);
				}
			}
			else
			{
				if(u_wersja.equals(wersje.get(0)))
				{
					ret_hash.put("TYP5", count);
				}
				else
				{
					ret_hash.put("TYP6", count);
				}
			}
			
			tmp_mess.set_message("Czy chcesz dodaæ kolejn¹ pozycjê do zamówienia?:");
			tmp_mess.show_mess();
			System.out.println(Arrays.toString(yes_no.toArray()));
			odp = getChoiceString(yes_no);
			
			if(odp.equals("Nie"))
				break;
			
		}while(true);
		
		return ret_hash;
	}
}

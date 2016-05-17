
public class Samochod3 extends Samochod {

	public Samochod3(boolean i){
		if (i){
			listaWyposarzenia[0] = "Przyciemniane szyby";
			listaWyposarzenia[1] = "Lepsze ABS";
			listaWyposarzenia[2] = "Szyberdach";
			listaWyposarzenia[3] = "Œwiat³a LED";
			listaWyposarzenia[4] = "Hamulce ceramiczne";
			listaWyposarzenia[5] = "Skórzana tapicerka";
			listaWyposarzenia[6] = "4 poduszki powietrzne";
			samochodZbudowany = true;
		}
		else;
	}
	@Override
	public void budujSamochod() {
		// TODO Auto-generated method stub
		listaWyposarzenia[0] = "Przyciemniane szyby";
		listaWyposarzenia[1] = "Lepsze ABS";
		listaWyposarzenia[2] = "Szyberdach";
		listaWyposarzenia[3] = "Œwiat³a LED";
		listaWyposarzenia[4] = "Hamulce ceramiczne";
		listaWyposarzenia[5] = "Skórzana tapicerka";
		listaWyposarzenia[6] = "4 poduszki powietrzne";
		samochodZbudowany = true;
	}
	public void wypiszSam(){
		int i;
		for(i = 0; i < 9; i++){
			System.out.println(listaWyposarzenia[i]);
		}
	}

}

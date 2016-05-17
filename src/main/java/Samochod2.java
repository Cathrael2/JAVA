
public class Samochod2 extends Samochod {

	public Samochod2(boolean i){
		if (i){
			listaWyposarzenia[0] = "Normalne szyby";
			listaWyposarzenia[1] = "Lepsze ABS";
			listaWyposarzenia[2] = "Szyberdach";
			listaWyposarzenia[3] = "Œwiat³a LED";
			listaWyposarzenia[4] = "Zwyk³e hamulce";
			listaWyposarzenia[5] = "Zwyk³a tapicerka";
			listaWyposarzenia[6] = "Jedna poduszka powietrzna";
			samochodZbudowany = true;
		}
		else;
	}
	@Override
	public void budujSamochod() {
		// TODO Auto-generated method stub
		listaWyposarzenia[0] = "Normalne szyby";
		listaWyposarzenia[1] = "Lepsze ABS";
		listaWyposarzenia[2] = "Szyberdach";
		listaWyposarzenia[3] = "Œwiat³a LED";
		listaWyposarzenia[4] = "Zwyk³e hamulce";
		listaWyposarzenia[5] = "Zwyk³a tapicerka";
		listaWyposarzenia[6] = "Jedna poduszka powietrzna";
		samochodZbudowany = true;
	}
	public void wypiszSam(){
		int i;
		for(i = 0; i < 9; i++){
			System.out.println(listaWyposarzenia[i]);
		}
	}

}


public class SportowyDekoratorSamochodow extends DekoratorSamochodu {
	
	public SportowyDekoratorSamochodow(Samochod dekorowanySamochod, boolean i) {
	      super(dekorowanySamochod);
	      if (i){
		       dekorowanySamochod.listaWyposarzenia[7] = "Benzyna 3.5";	       
		       dekorowanySamochod.listaWyposarzenia[8] = "Manualna skrzynia biegów";
	      }
	      else;  
	   }

	   @Override
	   public void budujSamochod() {
		   //dekorowanySamochod.budujSamochod();
	       dekorowanySamochod.listaWyposarzenia[7] = "Benzyna 3.5";	       
	       dekorowanySamochod.listaWyposarzenia[8] = "Manualna skrzynia biegów";
	   }
		public void wypiszSam(){
			int i;
			for(i = 0; i < 9; i++){
				System.out.println(dekorowanySamochod.listaWyposarzenia[i]);
			}
		}
}

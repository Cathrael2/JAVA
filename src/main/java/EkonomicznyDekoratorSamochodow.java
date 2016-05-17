
public class EkonomicznyDekoratorSamochodow extends DekoratorSamochodu {
	
	public EkonomicznyDekoratorSamochodow(Samochod dekorowanySamochod, boolean i) {
	
	      super(dekorowanySamochod);
	  	if (i){
	      dekorowanySamochod.listaWyposarzenia[7] = "Diesel 2.0 TDI";	       
	       dekorowanySamochod.listaWyposarzenia[8] = "Automatyczna skrzynia biegów";
		}
		else;
	   }

	  @Override
	   public void budujSamochod() {
		   //this.budujSamochod();
	       dekorowanySamochod.listaWyposarzenia[7] = "Diesel 2.0 TDI";	       
	       dekorowanySamochod.listaWyposarzenia[8] = "Automatyczna skrzynia biegów";
	   }
		public void wypiszSam(){
			int i;
			for(i = 0; i < 9; i++){
				System.out.println(dekorowanySamochod.listaWyposarzenia[i]);
			}
		}


}

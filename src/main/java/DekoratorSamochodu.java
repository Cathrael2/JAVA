
public abstract class DekoratorSamochodu extends Samochod {
	
	protected Samochod dekorowanySamochod;

	   public DekoratorSamochodu(Samochod dekorowanySamochod){
	      this.dekorowanySamochod = dekorowanySamochod;
	   }

	   public void budujSamochod(){
		   dekorowanySamochod.budujSamochod();
	   }



}

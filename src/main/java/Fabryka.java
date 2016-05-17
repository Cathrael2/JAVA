public class Fabryka {
	
   //use getShape method to get object of type shape 
   public Samochod wyprodukuj(String typSamochodu){
      if(typSamochodu == null){
         return null;
      }		
      if(typSamochodu.equalsIgnoreCase("TYP1")){
         return new EkonomicznyDekoratorSamochodow(new Samochod1(true), true);
         
      } else if(typSamochodu.equalsIgnoreCase("TYP2")){
         return new SportowyDekoratorSamochodow(new Samochod1(true), true);
         
      } else if(typSamochodu.equalsIgnoreCase("TYP3")){
         return new EkonomicznyDekoratorSamochodow(new Samochod2(true), true);
         
      } else if(typSamochodu.equalsIgnoreCase("TYP4")){
          return new SportowyDekoratorSamochodow(new Samochod2(true), true);
          
      } else if(typSamochodu.equalsIgnoreCase("TYP5")){
          return new EkonomicznyDekoratorSamochodow(new Samochod3(true), true);
          
      } else if(typSamochodu.equalsIgnoreCase("TYP6")){
          return new SportowyDekoratorSamochodow(new Samochod3(true), true);
          
      }
      
      
      return null;
   }
}
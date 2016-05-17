import java.util.Hashtable;

public class FabrykaSamochodow implements Kontener {

	FabrykaSamochodow(int i){
		n = i;
		tablicaSamochodow = new Samochod[n];
	}
	Fabryka fabryka = new Fabryka();
	int n;
	public Samochod[] tablicaSamochodow;
	public void stworzSamochody(Hashtable<String, Integer> samochody){
		int temp;
		int i = 0, j;
		if (samochody.get("TYP1") != null){
			temp = samochody.get("TYP1");
			j = 0;
			while((i < n) && (j < temp)){
				tablicaSamochodow[i] = fabryka.wyprodukuj("TYP1");
				j++;
				i++;
			}
		} if (samochody.get("TYP2") != null){
			temp = samochody.get("TYP2");
			j = 0;
			while((i < n) && (j < temp)){
				tablicaSamochodow[i] = fabryka.wyprodukuj("TYP2");
				j++;
				i++;
			} 
		} if (samochody.get("TYP3") != null){
			temp = samochody.get("TYP3");
			j = 0;
			while((i < n) && (j < temp)){
				tablicaSamochodow[i] = fabryka.wyprodukuj("TYP3");
				j++;
				i++;
			}
		} if (samochody.get("TYP4") != null){
			temp = samochody.get("TYP4");
			j = 0;
			while((i < n) && (j < temp)){
				tablicaSamochodow[i] = fabryka.wyprodukuj("TYP4");
				j++;
				i++;
			}
		} if (samochody.get("TYP5") != null){
			temp = samochody.get("TYP5");
			j = 0;
			while((i < n) && (j < temp)){
				tablicaSamochodow[i] = fabryka.wyprodukuj("TYP5");
				j++;
				i++;
			}
		} if (samochody.get("TYP6") != null){
			temp = samochody.get("TYP6");
			j = 0;
			while((i < n) && (j < temp)){
				tablicaSamochodow[i] = fabryka.wyprodukuj("TYP6");
				j++;
				i++;
			}
		}
	}
	public Iterator getIterator() {
		// TODO Auto-generated method stub
		return new IteratorSamochodow();
		
	}

	public class IteratorSamochodow implements Iterator {

	      int index;

	      public boolean hasNext() {
	      
	         if(index < tablicaSamochodow.length){
	            return true;
	         }
	         return false;
	      }
	      public Samochod thisOne(){
	    	  return tablicaSamochodow[index];
	      }
	      public Samochod next() {
	      
	         if(this.hasNext()){
	            return tablicaSamochodow[index++];
	         }
	         return null;
	      }
	}

}

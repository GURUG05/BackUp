import java.util.ArrayList;


public class NewPharma {
	 int length=100;
	 ArrayList<Medicines>medlist;
    
	public NewPharma(ArrayList<Medicines>medicines) {
		super();
		this.medlist=medicines;
		}
	public ArrayList<Medicines> GetlistofMedicines() {
		return medlist;
		
	}
	
}

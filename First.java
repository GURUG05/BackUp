import java.util.ArrayList;
public class First {

	public static void main(String[] args) {
	 Medicines medicine1 = new Medicines("\n1.paracetamol","2.dolo","3.citricin","4.syrup");
	 Medicines medicine2 = new Medicines("5.demo tab","6.test tab","7.demo tab","8.test tab");
	
	 
	 ArrayList<Medicines>medlist=new ArrayList<Medicines>();
	 ArrayList<String>stringlist=new ArrayList<String>();
	medlist.add(medicine1);            //passing object to list
	 medlist.add(medicine2);
	 
	 
	 NewPharma pharma = new NewPharma(medlist); 
	 NewMedicalStore medicalstore=new NewMedicalStore(medlist);
	 
	 
	 System.out.println("Pharmacy name:NewPharmaso ");
	 System.out.println("List of medicicnes: ");
	 
	 ArrayList<Medicines>medicinelist1= pharma.GetlistofMedicines();
	 for(Medicines name:medicinelist1) {
		 
		 System.out.println(name.tablet1);
		 System.out.println(name.tablet2);
		 System.out.println(name.tablet3);
		 System.out.println(name.tablet4);
	 }
	 System.out.println("Pharmacy name:Newmedicostore ");
	 System.out.println("List of medicicnes: ");

	 ArrayList<Medicines>medicinelist2= pharma.GetlistofMedicines();
	 for(Medicines name:medicinelist2) {
		 
		 System.out.println(name.tablet1);
		 System.out.println(name.tablet2);
		 System.out.println(name.tablet3);
		 System.out.println(name.tablet4);
	 }
	 pharma = null;
	 System.out.println(medicine1.tablet1);
	// System.out.println(pharma.length);   // null pointer exception object does not exist
	}

}

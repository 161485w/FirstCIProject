
public class RentalCalculator {

	public static double carRental(String carModel, int duration, boolean firstTimer, boolean member){
		
		double rentalFees = 0.0;
				
		if (firstTimer){
			if (carModel.equals("Honda"))
				rentalFees = 65.0*duration*0.95;
			else
				rentalFees = 80.0*duration*0.95;
		}
		else {
			if (member){

				//handle member transactions
				// ...

			}
			else { //non-member
				
				//handle non-member transactions
				//...
				
			}
		}
		
		return rentalFees;
	}
	

}

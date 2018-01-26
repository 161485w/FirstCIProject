
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
				//10% discount for subsequent rentals <= 3 days 
				//20% discount if rental > 3 days 
				// Membership free
				if (carModel.equals("Honda") && duration <= 3)
					rentalFees = 65.0*duration*0.90;
				else if (carModel.equals("Honda") && duration > 3)
					rentalFees = 65.0*duration*0.80;
				else if (carModel.equals("Toyota") && duration <= 3)
					rentalFees = 80.0*duration*0.90;
				else if (carModel.equals("Toyota") && duration > 3)
					rentalFees = 80.0*duration*0.80; 			

			}
			else { //non-member
				
				//handle non-member transactions
				//...
				//no discount at all
				if (carModel.equals("Honda"))
					rentalFees = 65.0*duration;
				else if (carModel.equals("Toyota"))
					rentalFees = 80.0*duration;
			}
		}
		
		return rentalFees;
	}
	

}

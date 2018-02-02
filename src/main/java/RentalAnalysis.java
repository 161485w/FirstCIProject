import java.util.ArrayList;

public class RentalAnalysis {

	public RentalAnalysis() {}
	
	public ArrayList<RentalRecord> createRecords(){
		ArrayList<RentalRecord> rList= new ArrayList<RentalRecord>();
		
		//for Honda Fit records
		RentalRecord rh1 = new RentalRecord("Honda Fit","Jul", 1543.75, 25);
		rList.add(rh1);
	
		RentalRecord rh2 = new RentalRecord("Honda Fit", "Aug", 1235.00, 20);
		rList.add(rh2);
		
		RentalRecord rh3 = new RentalRecord("Honda Fit", "Sep", 1235.00, 20);
		rList.add(rh3);
		
		RentalRecord rh4 = new RentalRecord("Honda Fit", "Oct", 1543.75, 25);
		rList.add(rh4);
		
		RentalRecord rh5 = new RentalRecord("Honda Fit", "Nov", 1852.50, 30);
		rList.add(rh5);
		
		RentalRecord rh6 = new RentalRecord("Honda Fit", "Dec", 3087.50, 50);
		rList.add(rh6);
		
		//for Toyota Wish records
		RentalRecord rt1 = new RentalRecord("Toyota Wish","Jul", 1140.00, 15);
		rList.add(rt1);
		
		RentalRecord rt2 = new RentalRecord("Toyota Wish","Aug", 1140.00, 15);
		rList.add(rt2);
		
		RentalRecord rt3 = new RentalRecord("Toyota Wish","Sep", 1140.00, 15);
		rList.add(rt3);
		
		RentalRecord rt4 = new RentalRecord("Toyota Wish","Oct", 2280.00, 30);
		rList.add(rt4);
		
		RentalRecord rt5 = new RentalRecord("Toyota Wish","Nov", 2660.00, 35);
		rList.add(rt5);
		
		RentalRecord rt6 = new RentalRecord("Toyota Wish","Dec", 3800.00, 50);
		rList.add(rt6);
		
		return rList;
	
	}
	
	//complete this method
		public double aveMonthlyRentalDur(String carModel, ArrayList<RentalRecord> rlist) { 
			double total = 0.0;
			double avg;
			int counter = 0;
				for(int i = 0; i < rlist.size(); i++){
					if(carModel == rlist.get(i).getModel()){
						total += rlist.get(i).getDuration();
						counter += 1;
						
					}else if(carModel == rlist.get(i).getModel()){
						total += rlist.get(i).getDuration();
						counter += 1;
					}
			}
				System.out.println(total);
				System.out.println(counter);
				avg = total / counter; 
				
				return Math.round(avg);
				
			
		}
		
		//complete this method
		public double totalRev(String carModel, ArrayList<RentalRecord> rlist) {
			double total = 0.0;
				for(int i = 0; i < rlist.size(); i++){
					if(carModel == rlist.get(i).getModel()){
						total += rlist.get(i).getRevenue();
						
					}else if(carModel == rlist.get(i).getModel()){
						total += rlist.get(i).getRevenue();
					}
			}
				System.out.println(total);
				return total;
			
		}
	
}

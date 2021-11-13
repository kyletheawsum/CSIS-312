package stevens.week.three;

public class PieceWorker extends Employee {

	private double wage;
	private int pieces;
	
	public PieceWorker(String firstName, String lastName, String socialSecurityNumber, double wage, int pieces) {
		super(firstName, lastName, socialSecurityNumber);
		
		setWage(wage);
		setPieces(pieces);
	}
	
	public void setWage(double wage) {
		
		if (wage < 0.0) // validate
			throw new IllegalArgumentException("Wage must be >= 0.0");

		this.wage = wage;
	}
	
	public double getWage() {
		return this.wage;
	}
	
	public void setPieces(int pieces) {
		
      if (pieces < 0) // validate
          throw new IllegalArgumentException("Pieces must be >= 0");

		this.pieces = pieces;
	}
	
	public int getPieces() {
		return this.pieces;
	}

	@Override
	public double earnings() {
		double earnings = this.wage * this.pieces;
		return earnings;
	}
	
   // return String representation of CommissionEmployee object
   @Override                                                   
   public String toString()                                    
   {                                                           
      return String.format("%s: %s%n%s: %d; %s: %.2f",    
         "piece-worker employee", super.toString(),              
         "pieces created", getPieces(),                       
         "wage rate", getWage());             
   } 
   
}
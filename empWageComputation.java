public class EmpWageComputation {
   public static final int IS_PART_TIME=1;
   public static final int IS_FULL_TIME=2;

        private final String company;
	private final int empRatePerHour;
	private final int numOfWorkingDays;
	private final int maxHoursPerMonth;
	private int totalEmpWage;

	public empWageComputation(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
		super();
		this.company = company;
		this.empRatePerHour = empRatePerHour;
		this.numOfWorkingDays = numOfWorkingDays;
		this.maxHoursPerMonth = maxHoursPerMonth;
	}
       public void computeEmpWage( ) {
       int empHrs=0, totalEmpHrs=0, totalWorkingDays=0;
       while( totalEmpHrs <= maxHoursPerMonth && totalWorkingDays < numOfWorkingDays ) {
         totalWorkingDays++;
         int empCheck=(int)Math.floor(Math.random()*10)%3;
         switch (empCheck) {
            case 1:
                 empHrs=4;
                 break;
            case 2:
                 empHrs=8;
                 break;
            default:
                 empHrs=0;
                  break;
         }
         totalEmpHrs=totalEmpHrs + empHrs; 
         System.out.println("Day: " + totalWorkingDays + "employee hours: " +empHrs);
         }
   totalEmpWage=totalEmpHrs*empRatePerHour;

         }
       public String toString() {
		return "Total Emp Wage for Company: "+company+" is "+totalEmpWage;
       }
       public static void main(String[] args) {
		empWageComputation HCL=new empWageComputation("HCL", 20, 2, 10);
		empWageComputation Wipro=new empWageComputation("Wipro", 10, 4, 20);
	
		HCL.computeEmpWage();
		System.out.println(HCL);
		

		Wipro.computeEmpWage();
		System.out.println(Wipro);
	
	}
	
}

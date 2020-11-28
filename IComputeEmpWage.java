public interface IComputeEmpWage {

	 public void addempWageComputation(String company,int empRatePerHour,int numOfWorkingDays,int maxHoursPerMonth);
	 public void computeEmpWage();
	 public int computeEmpWage(empWageComputation empWageComputation);
	 
	 public int getTotalWage(String company);

}

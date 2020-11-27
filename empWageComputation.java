public class empWageComputation {
   public static final int IS_PART_TIME=1;
   public static final int IS_FULL_TIME=2;

   public static int computeEmpWage(String company,int empRatePerHour,int numOfWorkingDays,int maxHoursPerMonth){
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
   int totalEmpWage=totalEmpHrs*empRatePerHour;
   System.out.println("Total Emp Wage for Company: "+company+"is: "+totalEmpWage);
   return totalEmpWage;
}
public static void main(String[] args) {
  computeEmpWage("HCL: ", 20, 4, 10);
  computeEmpWage("Wipro: ", 10, 6, 20);
 }
}

  public class EmpWageBuilderArray {

        public static final int IS_PART_TIME=1;
        public static final int IS_FULL_TIME=2;

        public int numOfCompany=0;

        empWageComputation empWageComputation[];

        public EmpWageBuilderArray()
        {
                empWageComputation=new empWageComputation[5];
        }

        private void addempWageComputation(String company,int empRatePerHour,int numOfWorkingDays,int maxHoursPerMonth)
        {
                empWageComputation[numOfCompany]=new empWageComputation(company, empRatePerHour, numOfWorkingDays, maxHoursPerMonth);
                numOfCompany++;
        }

        private void computeEmpWage()
        {
                for (int i = 0; i <numOfCompany; i++)
                {
                        empWageComputation[i].setTotalEmpWage(this.computeEmpWage(empWageComputation[i]));
                        System.out.println(empWageComputation[i]);
                }
        }


       private int computeEmpWage(empWageComputation empWageComputation) {
       int empHrs=0, totalEmpHrs=0, totalWorkingDays=0;
       while( totalEmpHrs <= empWageComputation.maxHoursPerMonth && totalWorkingDays < empWageComputation.numOfWorkingDays ) {
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
        return totalEmpHrs * empWageComputation.empRatePerHour;
       }
       public static void main(String[] args) {
                EmpWageBuilderArray empWageBuilder=new EmpWageBuilderArray();
                empWageBuilder.addempWageComputation("hcl", 20, 2, 10);
                empWageBuilder.addempWageComputation("wipro", 10, 4, 20);
                empWageBuilder.computeEmpWage();
        }

}


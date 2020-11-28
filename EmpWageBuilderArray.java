
  import java.util.HashMap;
  import java.util.Map;
  import java.util.LinkedList;
  public class EmpWageBuilderArray implements IComputeEmpWage {

        public static final int IS_PART_TIME=1;
        public static final int IS_FULL_TIME=2;

        public int numOfCompany=0;

        private LinkedList<empWageComputation> empWageComputationList;
        private Map<String, empWageComputation>empWageComputationMap;
<<<<<<< HEAD
        
=======
>>>>>>> UC-12-Array-LinkedList
        public EmpWageBuilderArray()
        {
                empWageComputationList= new LinkedList<empWageComputation>();
                empWageComputationMap=new HashMap<String, empWageComputation>();
        }

        public void addempWageComputation(String company,int empRatePerHour,int numOfWorkingDays,int maxHoursPerMonth)
        {
            empWageComputation empWageComputation=new empWageComputation(company, empRatePerHour, numOfWorkingDays, maxHoursPerMonth);	
		
                empWageComputationList.add(empWageComputation);
                empWageComputationMap.put(company, empWageComputation);
        }

        public void computeEmpWage()
        {
                for (int i = 0; i <numOfCompany; i++)
                {
                        empWageComputation company=empWageComputationList.get(i);
		        company.setTotalEmpWage(this.computeEmpWage(company));
			System.out.println(company);
                }
        }


       public int computeEmpWage(empWageComputation empWageComputation) {
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
	public int getTotalWage(String company) {
		return empWageComputationMap.get(company).totalEmpWage;
		 
	}
  }

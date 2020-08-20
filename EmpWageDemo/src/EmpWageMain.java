
public class EmpWageMain {

	public static void main(String args[]) {
		EmployeeWageOops empWageBuilder = new EmployeeWageOops();
		empWageBuilder.addCompanyEmpWage("icici", 50, 4, 100);
		empWageBuilder.addCompanyEmpWage("DMart", 20, 4, 100);
		empWageBuilder.addCompanyEmpWage("Tcs", 60, 6, 100);
		empWageBuilder.addCompanyEmpWage("IBM", 100, 8, 100);
		empWageBuilder.addCompanyEmpWage("Google", 100, 10, 100);
		empWageBuilder.computeEmpWage();
		System.out.println( " Total wage of queried company " + empWageBuilder.getTotalEmpWage("Google"));
		System.out.println();
	}

}

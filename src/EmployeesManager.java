import java.util.Collection;

public class EmployeesManager {
  ArrayList<Employee> emp = new ArrayList<Employee>();

  /**
   * Implement EmployeesManager to manage all employees of a company
   *
   */

  /**
   * Adds an Employee
   *
   * @param employee
   * @return
   */
  String addEmployee(Employee employee) {
    // TODO - implement this
    emp.add(employee);    
    String str=employee.firstName + employee.birthDate;
    return str;
    
  }

  /**
   * Finds an Employee
   *
   * @param employeeId
   * @return
   */
  Employee findEmployee(String employeeId) {
    for(Employee e: emp)
					{
						if(employeeId == e.id)
						{
							return e;
						}
					}
    return null;
    
  }

  /**
   * Find all Employee who are older than X years
   * @param years
   * @return
   */
  Collection<Employee> findEmployee(int years) {
    
    Collection<Employee> emp1 = new ArrayList<Employee>();
					for(Employee e: emp)
					{
						if(years < e.ageInYears)
						{
						emp1.add(e);
						}
					}
    return EmployeeListByAge;
					
    
  }

  /**
   * Removes an employee
   *
   * @param employeeId
   * @return
   */
  boolean removeEmployee(String employeeId) {
    // TODO - implement this
    boolean flag=false;
    for(Employee e: emp)
					{
						if(employeeId == e.id)
						{
							 emp.remove(e); 
              flag=true;
						}
					}
    return flag;
    return false;
  }

  /**
   * Lists all Employees
   *
   * @return
   */
  Collection<Employee> listEmployees() {
    // TODO - implement this
    
    return emp;
  }
}

class Employee {

  private int ageInYears;
  private int ageInMonths;
  private String birthDate;
  private String firstName;
  private String lastName;

  private String employeeId;

  public Employee(String fullName, String birthDate) {
    // TODO - implement this
  }

  public int getAgeInYears() {
    return ageInYears;
  }

  public int getAgeInMonths() {
    return ageInMonths;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getEmployeeId() {
    return employeeId;
  }

  public String getBirthDate() {
    return birthDate;
  }
}

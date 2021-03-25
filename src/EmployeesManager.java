import java.util.*;
import java.util.concurrent.TimeUnit;
class Employee implements Comparator<Employee> {
  private String name;
  private String firstName;
  private int ageInYears;
  private int ageInMonths;
  
  public Employee(){}
    public void setfirstName(String firstName) {
      this.firstName = firstName;
    }
  
    public void setlastName(String lastName) {
      this.lastName = lastName;
    }
  
    public int setAgeInYears(Integer ageInYears) {
      this.ageInYears = ageInYears;
    }
  
    public int setAgeInMonths(Integer ageInMonths) {
      this.ageInMonths = ageInMonths;
    }

    public String getfirstName() {
      return firstName;
    }

    public String getlastName() {
      return lastName;
    }
  
    public int getAgeInYears() {
      return ageInYears;
    }
  
     public int getAgeInMonths() {
      return ageInMonths;
    }
    
  }
  public class Display_Employee  {
    public static void main(String[] args)
    {
      int choice,i,size,mob_serch_result,firstName_serch_result,lastName_serch_result,ageInYears,ageInMonths;
      String firstName,lastName,mob_serch,ageInYears_serch,ageInMonths_serch,update_search,choice_update;
      String firstName1,lastName1,mob_serch,ageInYears_serch1,ageInMonths_serch1,update_search,choice_update;
      Scanner sc = new Scanner(System.in);
 //     Map< String, Integer > mapEmail=new HashMap< String, Integer >();
 //     Map< String, Integer > mapPhone=new HashMap< String, Integer >();
      List<Employee> list = new ArrayList<Employee>();
      
      System.out.println("How much details you want to Enter");
      size=sc.nextInt()  ;
      for(i=0;i<size;i++)
      {
      System.out.println("Enter the "+(i+1)+" Employee Details \n");
      System.out.println("Enter the firstname ");
      name=sc.next();
      System.out.println("Enter the lastname ");
      name=sc.next();
      System.out.println("Enter the ageInYears ");
      age=sc.nextInt();
      System.out.println("Enter the ageInMonths ");
      age=sc.nextInt();
      Employee employee=new Employee();
      employee.setAgeInYears(ageInYears);
      employee.setAgeInYears(ageInMonths);  
      employee.setfirstName(firstName);
      employee.setfirstName(lastName);  
      list.add(employee);
    }

    /Test input Start/
    firstName="Shubham";
    lastName="Adgane";
    ageInYears=26;
    ageInMonths=5;
    Employee employee=new Employee();
    employee.setAgeInYears(ageInYears);
    employee.setAgeInYears(ageInYears);
    employee.setfirstName(firstName);
    employee.setlastName(lastName);
    
    list.add(employee);

    /Test input end/

    for (Employee s : list)
    {
      System.out.println("\n\n"+s.getFirstName()+" " +s.getLastName()+" " +s.getAgeInYears()+" " +s.getAgeInMonths());
    }
    while(true)
    {
      System.out.println("===========================================================================================================");
      System.out.println("Press 1 for Sort by ageInYears\nPress 2 for find the Person by firstName\nPress 3 for find the Person by lastName\nPress 4 for Sort by ageInMonths\n\nPress 5 for print list ");
      choice= sc.nextInt();
      sc.nextLine();
      switch(choice)
      {
        case 1:
        Collections.sort(list,new Employee());
        for (Employee s : list)
        {
          System.out.println("  FirstName : "+s.getFirstName()+"  LastName  : " +s.getLastName()+" AgeInYears : " +s.getAgeInYears()+" AgeInMonths : " +s.getAgeInMonths());
        }
        System.out.println("===========================================================================================================");

        break;
        case 2:
        System.out.println("Enter the FirstName of Employee ");
        firstName_serch=sc.next();
        System.out.println("FirstName FirstName_serch_result is "+firstName_serch_result);
        Employee Emp_firstName_obj=(Employee)list.get(firstName_serch_result);
        System.out.println("Employee Name:  "+Emp_bod_obj.getName()+"  Email : "+Emp_phone_obj.getEmail()+"  Age : "+Emp_phone_obj.getAge()+"  City : "+Emp_phone_obj.getAddress());
        break;
        case 3:
        System.out.println("Enter the LastName of Employee ");
        lastName_serch=sc.nextLine();
        System.out.println("LastName_serch_result is "+lastName_serch_result);
        Employee Emp_lastName_obj=(Employee)list.get(lastName_serch_result);
        System.out.println("Employee Name:  "+Emp_bod_obj.getName()+"  Email : "+Emp_phone_obj.getEmail()+"  Age : "+Emp_phone_obj.getAge()+"  City : "+Emp_phone_obj.getAddress());
        break;
        case 4:
        System.out.println(" Enter the Age In Years ");
        choice_update_for_ageInYears=sc.next();
        choice_update_for_ageInYears=choice_update_for_ageInYears;
        if(choice_update_for_ageInYears.equals("30")||choice_update_for_ageInYears.equals("30"))
        {
          System.out.println("  AgeInYears_serch_result "+AgeInYears_serch_result);
          Employee Emp_update_obj_ageInYears=(Employee)list.get(ageInYears_serch_result);
          System.out.println("\t\t\t\t\t\t\tYour Search Result");
         System.out.println("Employee Name:  "+Emp_bod_obj.getName()+"  Email : "+Emp_phone_obj.getEmail()+"  Age : "+Emp_phone_obj.getAge()+"  City : "+Emp_phone_obj.getAddress());
        
        case 5:
        Iterator<Employee> itr=list.iterator();

        while(itr.hasNext())
        {
          Employee employe = itr.next();
          System.out.print("  firstName:  "+employe.getFirstName());
          System.out.print("  lastName:  "+employee.getLastName());
          System.out.print("  ageInYears:  "+employe.getAgeInYears());
          System.out.print("  ageInMonths:  "+employe.getAgeInMonths());
  
        }
        System.gc();
        break;
        default:
        System.out.println("\n\t***Please give a valid Input*\t\n");
        break;
      }

    }
  }
}

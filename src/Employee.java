public class Employee {/** this class is called Employee*/

private  static String name;
    private static String lastname;
    private static double salary;

    public Employee(){
        name=null;
        lastname=null;
        salary=0.0;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;

    }
    public void setLastname(String lastname){
        this.lastname=lastname;
    }
    public String getLastname(){
        return lastname;

    }
    public void setSalary(double salary){
        this.salary=salary;
    }
    public double getSalary(){
        if(salary<1)
            salary=0;
        return salary;

    }
    public double yearlysalary(){
        /** yearly salary method multiplies the salary
         By 12*/
        salary=salary*12;
        return salary;
    }



}

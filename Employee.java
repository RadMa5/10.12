import java.util.Objects;

public class Employee{
    private String firstName;
    private String lastName;
    private Integer age;
    private Double salary;

    public int getAge(){
        return age;
    }
    public double getSalary(){
        return salary;
    }
    public String getFullName(){
        String fullN = firstName + lastName;
        return fullN;
    }
    public void setFirstName(String fn){
        firstName = fn;
    }
    public void setLastName(String ln){
        lastName = ln;
    }
    public void setAge(int newAge){
        age = newAge;
    }
    public void setSalary(double newSalary){
        salary = newSalary;
    }

    public void employee(String fn, String ln, int nAge, double nsal){
        firstName = fn;
        lastName = ln;
        age = nAge;
        salary = nsal;
    }
    public void employee(String fn, String ln, int nAge){
        firstName = fn;
        lastName = ln;
        age = nAge;
        salary = 1000.0;
    }
    public void employee(String fn, String ln){
        firstName = fn;
        lastName = ln;
        age = 25;
        salary = 1000.0;
    }
    public String toString(){
        return new String("Full name: " + firstName + " " + lastName + " age: " + age + " salary: " + salary);
    }

    @Override
    public boolean equals(Object obj){
        if (obj == null) {return false;}
        if (!(obj instanceof Employee)){return false;}
        Employee object = (Employee) obj;
        String fn = new String(firstName + " " + lastName);
        return fn.equals(object.getFullName());
    }

    @Override
    public int hashCode(){
        return Objects.hash(firstName, lastName, age);
    }
}
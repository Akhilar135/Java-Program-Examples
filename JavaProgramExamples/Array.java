class Employee{
    int empId;
    String empName;
    int salary;
}
public class Array{
    public static void main(String[] args){
        int array1[]={1,2,3,4,5,6,7,8,9};
        System.out.println(array1[2]);

        Employee emp1 = new Employee();
        emp1.empId=101;
        emp1.empName="Akhila";
        emp1.salary=28000;

        Employee emp2 = new Employee();
        emp2.empId=102;
        emp2.empName="Dona";
        emp2.salary=30000;

        Employee emp3 = new Employee();
        emp3.empId=103;
        emp3.empName="Thomas";
        emp3.salary=31000;

        Employee empArr[]=new Employee[3];
        empArr[0]=emp1;
        empArr[1]=emp2;
        empArr[2]=emp3;

        for(Employee employee:empArr){
            System.out.println(employee);
            System.out.println(employee.empId+" "+employee.empName+" "+employee.salary);
        }
    }
}
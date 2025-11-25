package exception;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Application {

    static void main(String[] args) {

        List<Employee> employeeList= Stream.of(new Employee("vivek",1),
                new Employee("sachin",2)).toList();

        Scanner xyz=new Scanner(System.in);

        System.out.println("enter the id ");
        int id= xyz.nextInt();

        boolean flag=false;

        for (Employee employee:employeeList)
        {
            if(employee.getEmpId()==id)
            {
                IO.println(employee);
                flag=true;
                break;
            }
        }

        if(!flag)
        {
            throw new RecordNotFoundException("Employee Id Does not exists");
        }
    }

}

package HandsOnStream;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeList {
    public static void main(String [] args)
    {
        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
        employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
        employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
        employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
        employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
        employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));



//        long male=employeeList.stream().filter((emp)->emp.getGender().equals("Male")).count();
//        System.out.println(male);
//        long female=employeeList.stream().filter((emp)->emp.getGender().equals("Female")).count();
//        System.out.println(female);
//
//
//        employeeList.stream().map((emp)->emp.getDepartment()).distinct().forEach((dept)->System.out.println(dept));
//
//        OptionalDouble maleage =employeeList.stream().filter((emp)->emp.getGender().equals("Male")).mapToInt((emp)->emp.getAge()).average();
//        System.out.println(maleage.getAsDouble());
//
//        OptionalDouble femaleage=employeeList.stream().filter((emp)->emp.getGender().equals("Female")).mapToInt((emp)->emp.getAge()).average();
//        System.out.println(femaleage.getAsDouble());

//        Optional emp=employeeList.stream().sorted((emp1,emp2)-> (int) (emp2.getSalary()-emp1.getSalary())).findFirst();
//        System.out.println(emp.get());

//        employeeList.stream().filter((emp)->emp.getYearOfJoining()>2015).forEach((emp->System.out.println(emp.getName())));

//        employeeList.stream()
//                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()))
//                .forEach((dept, count) -> System.out.println(dept + " " + count));
//
//
//        employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary))).forEach((dept, avg) -> System.out.println(dept + " " + avg));


//        Optional employee=employeeList.stream().filter((emp)->emp.getDepartment().equals("Product Development")).sorted((emp1,emp2)->emp1.getAge()-emp2.getAge()).findFirst();
//        System.out.println(employee.get());

//        Optional employee=employeeList.stream().sorted((emp1,emp2)->emp1.getYearOfJoining()-emp2.getYearOfJoining()).findFirst();
//        System.out.println(employee.get());

//        employeeList.stream().filter((emp)->emp.getDepartment().equals("Sales And Marketing")).collect(Collectors.groupingBy(Employee::getGender,Collectors.counting())).forEach((gen,cou)->System.out.println(gen+" "+cou));

//        employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getSalary))).forEach((gen, avg) -> System.out.println(gen + " " + avg));

//        employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.toList())).forEach((dept, empList) -> {
//            System.out.println(dept);
//            empList.stream().forEach((emp)->System.out.println(emp.getName()));
//        });


//        double res=employeeList.stream().mapToDouble((emp)->emp.getSalary()).sum();
//        System.out.println(res);

//        OptionalDouble res=employeeList.stream().mapToDouble((emp)->emp.getSalary()).average();
//        System.out.println(res.getAsDouble());


        Map<Boolean, List<Employee>> res = employeeList.stream()
                .collect(Collectors.groupingBy(emp -> emp.getAge() <= 25));

       List<Employee> t= res.get(true);
       t.forEach((emp->System.out.println(emp.getName())));

       System.out.println("Employee above 25 years old");

       List<Employee> f=res.get(false);
       f.forEach((emp->System.out.println(emp.getName())));
    }
}

package cydeo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Service {


    public static List<Address> getAllAddress() {
        return DataGenerator.ADDRESS_LIST;
    }

    public static List<Company> getAllCompanies() {
        return DataGenerator.COMPANY_LIST;
    }

    public static List<Employee> getAllEmployees() {
        return DataGenerator.EMPLOYEE_LIST;
    }


    //***********DEFINE YOUR NECESSARY METHODS HERE***********


    public static List<Employee> filterForEmployeeWithNumeric(List<Employee> employees, Predicate<Integer> predicate){

        List<Employee> result = new ArrayList<>();

        for (Employee employee : employees) {
            if (predicate.test(employee.getId())){
                result.add(employee);
            }
        }
        return result;
    }

    public static List<Employee> filterForEmployee(List<Employee> employees, Predicate<Employee> predicate){

        List<Employee> result = new ArrayList<>();

        for (Employee employee : employees) {
            if (predicate.test(employee)){
                result.add(employee);
            }
        }
        return result;
    }

    public static <T> List<T> filter(List<T> elements, Predicate<T> predicate) {
        List<T> result = new ArrayList<>();

        for (T element : elements) {
            if (predicate.test(element)) {
                result.add(element);
            }
        }
        return result;
    }

    public static <T> List<String> getSpecificAttributes(List<T> elements, Function<T,String> function){

        List<String> nameAgeList = new ArrayList<>();

        for (T element : elements) {
            nameAgeList.add(function.apply(element));
        }

        return nameAgeList;
    }

}

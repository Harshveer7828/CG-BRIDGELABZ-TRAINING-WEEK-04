package com.capgemini.map_interface.group_object_by_property;
import java.util.*;

public class EmployeeGrouper {
    public static Map<String, List<Employee>> groupByDepartment(List<Employee> employees) {
        Map<String, List<Employee>> departmentMap = new HashMap<>();

        for (Employee emp : employees) {
            String department = emp.getDepartment(); // Get department name
            List<Employee> empList = departmentMap.getOrDefault(department, new ArrayList<>());
            empList.add(emp);
            departmentMap.put(department, empList);
        }
        return departmentMap;
    }
}

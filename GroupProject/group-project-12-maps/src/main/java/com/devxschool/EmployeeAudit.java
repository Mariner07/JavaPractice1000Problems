package com.devxschool;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.Arrays.asList;

public class EmployeeAudit {

    public static void main(String[] args) {

        /**
         * There is a list of employee names,
         * write a function to update names with their employee identification numbers, so they have 4 digits.
         * ex:
         * [Nitin Kumar Yadav, Sudhir Rana, Komal Sharawat, Suman Lata, Naresh Kumar, Sohan Singh]
         * {0006=Sohan Singh, 0007=Vinod Kumar, 0004=Suman Lata, 0005=Naresh Kumar, 0002=Sudhir Rana, 0003=Komal Sharawat, 0001=Nitin Kumar Yadav}
         */

        List<String> employeeList = asList("Nitin Kumar Yadav", "Sudhir Rana", "Komal Sharawat", "Suman Lata", "Naresh Kumar", "Sohan Singh", "Vinod Kumar");

        //TODO write your code here
        EmployeeAudit employeeAudit = new EmployeeAudit();
        Map<String, String> employeeMap = employeeAudit.addEmployeeId(employeeList);
        System.out.println(employeeMap);
    }

    public Map<String, String> addEmployeeId(List<String> employeeList) {
        //TODO implement this method
        Map<String, String> employeeMap = new HashMap<>();
        for(int i = 0; i < employeeList.size(); i++){
            String id = String.format("%04d", i+1);
            employeeMap.put(id, employeeList.get(i));
        }
        return employeeMap;
    }
}

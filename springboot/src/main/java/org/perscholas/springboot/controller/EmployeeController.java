package org.perscholas.springboot.controller;

import lombok.extern.slf4j.Slf4j;
import org.perscholas.springboot.database.dao.EmployeeDAO;
import org.perscholas.springboot.database.entity.Employee;
import org.perscholas.springboot.formbean.CreateEmployeeFormBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Slf4j
@Controller
public class EmployeeController {

    @Autowired
    private EmployeeDAO employeeDAO;

    @GetMapping("/employee/create")
    public ModelAndView createEmployee() {
        ModelAndView response = new ModelAndView("employee/create");
        log.debug("In create customer with no args");
        return response;
    }

    @GetMapping("/employee/createSubmit")
    public ModelAndView createEmployee(CreateEmployeeFormBean form){
        ModelAndView response=new ModelAndView("employee/create");

        System.out.println("firstName"+form.getFirstName());
        System.out.println("lastName"+form.getLastName());
        System.out.println("phone"+form.getDepartmentName());

        Employee employee = new Employee();
        employee.setFirstName(form.getFirstName());
        employee.setLastName(form.getLastName());
        employee.setDepartmentName(form.getDepartmentName());
        employeeDAO.save(employee);
        log.debug("In create customer with incoming args");


        return response;
    }
}

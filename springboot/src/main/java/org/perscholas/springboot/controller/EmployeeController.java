package org.perscholas.springboot.controller;

import lombok.extern.slf4j.Slf4j;
import org.perscholas.springboot.database.dao.EmployeeDAO;
import org.perscholas.springboot.database.entity.Employee;
import org.perscholas.springboot.formbean.CreateEmployeeFormBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

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
    @GetMapping("/employee/search")
    public ModelAndView search(
            @RequestParam(required = false) String firstName,
            @RequestParam(required = false) String lastName) {

        ModelAndView response = new ModelAndView("/employee/search");

        log.debug("In the employee search.jsp controller method: firstName={}, lastName={}", firstName, lastName);

        if (firstName != null || lastName != null) {
            List<Employee> employees = employeeDAO.findByFirstNameOrLastName(firstName != null ? firstName : lastName);
            response.addObject("employeeVar", employees);
        }

        response.addObject("firstName", firstName);
        response.addObject("lastName", lastName);

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

    @GetMapping("/employee/edit/{employeeId}")
    public ModelAndView editEmployee(@PathVariable int employeeId) {
        ModelAndView response = new ModelAndView("employee/create");
        Employee employee=employeeDAO.findById(employeeId);
        CreateEmployeeFormBean form=new CreateEmployeeFormBean();

        if(employee!=null){
            form.setId(employee.getId());
            form.setFirstName(employee.getFirstName());
            form.setLastName(employee.getLastName());
            form.setDepartmentName(employee.getDepartmentName());
        } else {
            log.warn("Employee with id " + employeeId + "was not found");
        }
        response.addObject("form",form);
        return response;
    }
}

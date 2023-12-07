package org.perscholas.springboot.controller;

import io.micrometer.common.util.StringUtils;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.perscholas.springboot.database.dao.CustomerDAO;
import org.perscholas.springboot.database.entity.Customer;
import org.perscholas.springboot.formbean.CreateCustomerFormBean;
import org.perscholas.springboot.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Slf4j
@Controller
public class CustomerController {

    @Autowired
    private CustomerDAO customerDao;

    @Autowired
    private CustomerService customerService;

   /* @GetMapping("/customer/search.jsp")
    public ModelAndView search.jsp(@RequestParam(required = false)String search.jsp) {
        ModelAndView response = new ModelAndView("customer/search.jsp");

        log.debug("In the customer search.jsp controller method: " + search.jsp);
        if (search.jsp != null) {

            List<Customer> customers = customerDao.findByFirstName(search.jsp);
            response.addObject("customerVar", customers);
            response.addObject("search.jsp", search.jsp);
            for (Customer customer : customers) {
                log.debug("customer: id = " + customer.getId() + "lastname = " + customer.getLastName());
            }
        }
        return response;
    }*/

    @GetMapping("/customer/search")
    public ModelAndView search(
            @RequestParam(required = false) String firstName,
            @RequestParam(required = false) String lastName) {

        ModelAndView response = new ModelAndView("/customer/search");

        log.debug("In the customer search.jsp controller method: firstName={}, lastName={}", firstName, lastName);

        if (firstName != null || lastName != null) {
            List<Customer> customers = customerDao.findByFirstNameOrLastName(firstName != null ? firstName : lastName);
            response.addObject("customerVar", customers);
        }

        response.addObject("firstName", firstName);
        response.addObject("lastName", lastName);

        return response;
    }

    @GetMapping("/customer/create")
    public ModelAndView createCustomer() {
        ModelAndView response = new ModelAndView("customer/create");
        log.debug("In create customer with no args");
        return response;
    }

    @GetMapping("/customer/createSubmit")
    public ModelAndView createCustomer(@Valid CreateCustomerFormBean form, BindingResult bindingResult){

        if (bindingResult.hasErrors()) {
            log.info("######################### In create customer submit - has errors #########################");
            ModelAndView response = new ModelAndView("customer/create");

            for (ObjectError error : bindingResult.getAllErrors()) {
                log.info("error: " + error.getDefaultMessage());
            }

            response.addObject("form", form);
            response.addObject("errors", bindingResult);
            return response;
        }

        log.info("######################### In create customer submit - no error found #########################");

        Customer c = customerService.createCustomer(form);

        // the view name can either be a jsp file name or a redirect to another controller method
        ModelAndView response = new ModelAndView();
        response.setViewName("redirect:/customer/edit/" + c.getId() + "?success=Customer Saved Successfully");

        return response;

    }

    @GetMapping("/customer/edit/{customerId}")
    public ModelAndView editCustomer(@PathVariable int customerId,
                                     @RequestParam(required = false) String success ) {
        log.info("######################### In /customer/edit #########################");
        ModelAndView response = new ModelAndView("customer/create");

        Customer customer = customerDao.findById(customerId);

        if (!StringUtils.isEmpty(success)) {
            response.addObject("success", success);
        }

        CreateCustomerFormBean form = new CreateCustomerFormBean();


        if(customer!=null) {
            form.setId(customer.getId());
            form.setFirstName(customer.getFirstName());
            form.setLastName(customer.getLastName());
            form.setPhone(customer.getPhone());
            form.setCity(customer.getCity());
        } else {
            log.warn("Customer with id " + customerId + "was not found");
        }
        response.addObject("form",form);
        return response;
    }
}

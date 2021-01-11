package onlineShop.controller;

import onlineShop.entity.Customer;
import onlineShop.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegistrationController {
    @Autowired
    private CustomerService customerService;

    @RequestMapping(value = "/customer/registration", method = RequestMethod.GET)
    public ModelAndView getRegistrationForm() {
        Customer customer = new Customer();
        return new ModelAndView("register", "customer", customer);
    }

    @RequestMapping(value = "/customer/registration", method = RequestMethod.POST)
    public ModelAndView registerCustomer(@ModelAttribute Customer customer, BindingResult bindingResult) {
        ModelAndView modelAndView = new ModelAndView();
        if (bindingResult.hasErrors()) {
            modelAndView.setViewName("register");
            return modelAndView;
        }

        customerService.addCustomer(customer);
        modelAndView.setViewName("login");
        modelAndView.addObject("registrationSuccess", "Registerd Successfully");
        return modelAndView;
    }
}

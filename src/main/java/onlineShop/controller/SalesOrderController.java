package onlineShop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SalesOrderController {
    @RequestMapping(value = "/order/{cartId}", method = RequestMethod.GET)
    public String createOrder(@PathVariable(value = "cartId") int cartId) {
        return "redirect:/checkout?cartId=" + cartId;
    }
}

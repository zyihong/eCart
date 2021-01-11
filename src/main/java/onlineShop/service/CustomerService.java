package onlineShop.service;

import onlineShop.dao.CustomerDao;
import onlineShop.entity.Cart;
import onlineShop.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    private CustomerDao customerDao;

    public void addCustomer(Customer customer) {
        Cart cart = new Cart();
        customer.setCart(cart);
        customer.getUser().setEnabled(true);

        customerDao.addCustomer(customer);
    }

    public Customer getCustomerByUsername(String username) {
        return customerDao.getCustomerByUsername(username);
    }
}

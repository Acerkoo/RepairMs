package service.customer;

import dao.customer.Customer;

import java.util.List;

public interface CustomerService {

    public boolean insertCustomer(Customer customer);
    public boolean deleteCustomer(String id);
    public void updateCustomer(String id, Customer customer);
    public Customer queryCustomerById(String id);
    public Customer queryCustomerByName(String name);
    public List queryCustomerALl();
}

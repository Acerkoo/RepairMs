package dao.customer;

import java.util.List;

public interface CustomerDao {
    public boolean insertCustomer(Customer customer);
    public boolean deleteCustomer(String id);
    public void updateCustomer(String id, Customer curtomer);
    public Customer queryCustomerById(String id);
    public Customer queryCustomerByName(String name);
    public List<Customer> queryCustomerALl();
}

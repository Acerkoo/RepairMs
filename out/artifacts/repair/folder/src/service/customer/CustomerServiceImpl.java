package service.customer;

import dao.customer.Customer;
import dao.customer.CustomerDaoImpl;

import java.util.List;

public class CustomerServiceImpl implements CustomerService{
    private static CustomerServiceImpl instance = new CustomerServiceImpl();
    public static CustomerServiceImpl getInstance() { return instance; }
    private CustomerServiceImpl() {}

    @Override
    public boolean insertCustomer(Customer customer) {
        CustomerDaoImpl customerDao = new CustomerDaoImpl();
        return customerDao.insertCustomer(customer);
    }

    @Override
    public boolean deleteCustomer(String id) {
        CustomerDaoImpl customerDao = new CustomerDaoImpl();
        return customerDao.deleteCustomer(id);
    }

    @Override
    public void updateCustomer(String id, Customer customer) {
        CustomerDaoImpl customerDao = new CustomerDaoImpl();
        customerDao.updateCustomer(id, customer);
    }

    @Override
    public Customer queryCustomerById(String id) {
        CustomerDaoImpl customerDao = new CustomerDaoImpl();
        return customerDao.queryCustomerById(id);
    }

    @Override
    public Customer queryCustomerByName(String name) {
        CustomerDaoImpl customerDao = new CustomerDaoImpl();
        return customerDao.queryCustomerByName(name);
    }

    @Override
    public List queryCustomerALl() {
        CustomerDaoImpl customerDao = new CustomerDaoImpl();
        return customerDao.queryCustomerALl();
    }
}

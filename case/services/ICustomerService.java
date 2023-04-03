package services;

public interface ICustomerService extends  IService{
    void delete(String customerId);
    void edit(String customerId);
}

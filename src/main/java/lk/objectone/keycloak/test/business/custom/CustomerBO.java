package lk.objectone.keycloak.test.business.custom;

import lk.objectone.keycloak.test.business.SuperBO;
import lk.objectone.keycloak.test.dto.CustomerDTO;

import java.util.List;

public interface CustomerBO extends SuperBO {

    void saveCustomer(CustomerDTO customerDTO) throws Exception;

    void updateCustomer(CustomerDTO customerDTO) throws Exception;

    void deleteCustomer(String id) throws Exception;

    List<CustomerDTO> findAllCustomers() throws Exception;

    CustomerDTO findCustomer(String id) throws Exception;
}

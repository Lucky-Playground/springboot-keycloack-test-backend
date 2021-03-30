package lk.objectone.keycloak.test.business.custom.impl;

import lk.objectone.keycloak.test.business.custom.CustomerBO;
import lk.objectone.keycloak.test.business.util.EntityDTOMapper;
import lk.objectone.keycloak.test.dao.CustomerDAO;
import lk.objectone.keycloak.test.dto.CustomerDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CustomerBOImpl implements CustomerBO {

    @Autowired
    private CustomerDAO customerDAO;

    @Autowired
    private EntityDTOMapper mapper;

    public CustomerBOImpl() {
    }

    @Override
    public void saveCustomer(CustomerDTO customerDTO) throws Exception {
        customerDAO.save(mapper.getCustomer(customerDTO));
    }

    @Override
    public void updateCustomer(CustomerDTO customerDTO) throws Exception {
        customerDAO.save(mapper.getCustomer(customerDTO));
    }

    @Override
    public void deleteCustomer(String id) throws Exception {
        customerDAO.deleteById(id);
    }

    @Override
    public List<CustomerDTO> findAllCustomers() throws Exception {
        List<CustomerDTO> customerDTOS = mapper.getCustomerDTOs(customerDAO.findAll());
        return customerDTOS;
    }

    @Override
    public CustomerDTO findCustomer(String id) throws Exception {
        return mapper.getCustomerDTO(customerDAO.findById(id).get());
    }
}

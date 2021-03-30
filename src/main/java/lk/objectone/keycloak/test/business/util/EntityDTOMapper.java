package lk.objectone.keycloak.test.business.util;


import lk.objectone.keycloak.test.dto.CustomerDTO;
import lk.objectone.keycloak.test.entity.Customer;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface EntityDTOMapper {

    Customer getCustomer(CustomerDTO dto);

    CustomerDTO getCustomerDTO(Customer customer);

    List<CustomerDTO> getCustomerDTOs(List<Customer> customers);
}

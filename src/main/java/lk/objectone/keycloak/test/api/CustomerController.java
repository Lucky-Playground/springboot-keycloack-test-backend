package lk.objectone.keycloak.test.api;

import lk.objectone.keycloak.test.business.custom.CustomerBO;
import lk.objectone.keycloak.test.dto.CustomerDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/v1/customers")
@CrossOrigin
@RestController
public class CustomerController {

    @Autowired
    private CustomerBO customerBO;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<CustomerDTO> getAllCustomers() throws Exception {
        return customerBO.findAllCustomers();
    }

    @GetMapping(value = "/{username}", produces = MediaType.APPLICATION_JSON_VALUE)
    public CustomerDTO getCustomer(@PathVariable String username) throws Exception {
        return customerBO.findCustomer(username);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public String saveCustomer(@RequestBody CustomerDTO customerDTO) throws Exception {
        customerBO.saveCustomer(customerDTO);
        return customerDTO.getUsername();
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping(value = "/{username}")
    public void deleteCustomer(@PathVariable String username) throws Exception {
        customerBO.deleteCustomer(username);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PutMapping(value = "/{username}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updateCustomer(@PathVariable String username, @RequestBody CustomerDTO customerDTO) throws Exception {
        customerDTO.setUsername(username);
        customerBO.updateCustomer(customerDTO);
    }

}

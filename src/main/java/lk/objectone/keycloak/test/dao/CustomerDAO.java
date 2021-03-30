package lk.objectone.keycloak.test.dao;

import lk.objectone.keycloak.test.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerDAO extends JpaRepository<Customer, String> {
}

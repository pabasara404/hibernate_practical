package lk.earth.hibernate_practical;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(exported = false)
public interface SupplierDao extends JpaRepository<Supplier, Integer> {

}

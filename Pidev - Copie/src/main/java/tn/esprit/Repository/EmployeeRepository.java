package tn.esprit.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.entities.Employee;
@Repository
public interface EmployeeRepository  extends JpaRepository<Employee, Long>{

}

package tn.esprit.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.entities.Company;
@Repository
public interface CompanyRepository extends JpaRepository<Company,Long > {

}

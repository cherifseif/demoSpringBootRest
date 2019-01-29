package formation.springboot.persistance.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import formation.springboot.persistance.model.Employe;

public interface IEmployeDAO extends JpaRepository<Employe, Integer> {

}

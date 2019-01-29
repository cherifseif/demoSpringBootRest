package formation.springboot.persistance.service;

import java.util.List;

import formation.springboot.persistance.model.Employe;

public interface IEmployeService {
	
	public void add(Employe employe);
	
	public void update ( Employe employe);
	
	public void delete (Employe employe);
	
	public List<Employe> findAll();
	
	public Employe findById(Integer id);
}

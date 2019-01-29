package formation.springboot.persistance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import formation.springboot.persistance.dao.IEmployeDAO;
import formation.springboot.persistance.model.Employe;


@Service
@Transactional
public class EmployeService implements IEmployeService {

	@Autowired
	IEmployeDAO dao;

	@Override
	public void add(Employe employe) {
		// TODO Auto-generated method stub
		dao.save(employe);
	}

	@Override
	public void update(Employe employe) {
		// TODO Auto-generated method stub
		dao.save(employe);

	}

	@Override
	public void delete(Employe employe) {
		// TODO Auto-generated method stub
		dao.delete(employe);
	}

	@Override
	public List<Employe> findAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Employe findById(Integer id) {
		// TODO Auto-generated method stub
		return dao.getOne(id);
	}

}

package formation.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import formation.springboot.persistance.model.Employe;
import formation.springboot.persistance.service.IEmployeService;

@RestController
public class EmployeController {
	
	@Autowired
	IEmployeService employeService;
	
	@GetMapping("/list")
	public List<Employe> findAll(){
		return employeService.findAll();
	}
	
	@PostMapping("/add")
	public void add(@RequestBody Employe employe) {
		employeService.add(employe);
	}
	
	@PutMapping("/update")
	public void update (@RequestBody Employe employe) {
		employeService.update(employe);
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete (@PathVariable Integer id) {
		
		Employe employe =  employeService.findById(id);
		employeService.delete(employe);
	}

}

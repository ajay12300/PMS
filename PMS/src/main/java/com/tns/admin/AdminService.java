package com.tns.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class AdminService {

	@Autowired
	 private AdminRepository repo;
	 
	 public List<Admin> listAll() 
	 {
	 return repo.findAll();
	 }
	 
	 public void save(Admin admin)
	 {
	 repo.save(admin);
	 }
	 
	 public Admin get(Long id) 
	 {
	 return repo.findById(id).get();
	 }
	 
	 public void delete(Long id) 
	 {
	repo.deleteById(id);
	 }
}

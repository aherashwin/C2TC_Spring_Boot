package com.example.demo;
import java.util.List;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class MallAdminService
{
	 @Autowired
	 private MallAdminRepository repo;

	 public List<MallAdmin> listAll() 
	 {
	 return repo.findAll();
	 }
	 
	 public void save(MallAdmin malladmin) 
	 {
	 repo.save(malladmin);
	 }
	 
	 public MallAdmin get(Integer id) 
	 {
	 return repo.findById(id).get();
	 }
	 
	 public void delete(Integer id) 
	 {
	 repo.deleteById(id);
	 }
}

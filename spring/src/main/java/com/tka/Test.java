package com.tka;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Student.Student;

@RestController
public class Test {
   @Autowired
   
   SessionFactory factory;
   
   @PostMapping("saveStudent")
    public void saveStudent(@RequestBody Student student) {
	   
    	System.out.println(student);
    	
    	Session session=factory.openSession();
    	
    	Transaction tx=session.beginTransaction();
    	
    	session.save(student);
    	
    	tx.commit();
    }
   
  
         @PutMapping("updateStudent")
         public void updateStudent(@RequestBody Student student) {
        	 
        	 System.out.println(student);
        	 
        	Session session= factory.openSession();
        	
        	Transaction tx=session.beginTransaction();
        	
        	session.update(student);
        	
        	tx.commit();
         }
         
         @GetMapping("getStudent/{id}")
         public Student getStudent(@PathVariable int id) {
        	 
        	Session session = factory.openSession();
        	
        	Student student=session.get(Student.class, id);
        	
        	return student;
}
         
         @DeleteMapping("deleteStudent/{id}")
         public Student deleteStudent(@PathVariable int id) {
        	 
        	Session session= factory.openSession();
        	
            Student student =session.get(Student.class, id);
       
           Transaction tx  = session.beginTransaction();
    
            session.delete(student);
    
          tx.commit();
        
	   return student;
       
       
         }
         @RequestMapping("getAllStudent")
        List<Student> getAllStudent(){
        	
        Session session = factory.openSession();
        
       Criteria cr = session.createCriteria(Student.class);
       
      List<Student>list =cr.list();
      
      return list;
     	 
         }
         @PostMapping("saveMultipleStudent")
         public void saveMultipleStudent(@RequestBody Student[]students) {
        	 
        	Session session= factory.openSession();
        	for(Student student:students){
        	Transaction tx=session.beginTransaction();
        	
        	session.save(student);
        	
        	tx.commit();
         }
}}
     
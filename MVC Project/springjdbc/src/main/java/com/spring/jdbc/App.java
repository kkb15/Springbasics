package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "My Program Started..........." );
//        ApplicationContext context= new ClassPathXmlApplicationContext("com/spring/jdbc/Config.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
        
		/*
		 * JdbcTemplate template=context.getBean("jdbcTemplate",JdbcTemplate.class);
		 * 
		 * // Insert Query String
		 * query="Insert into Student(id, name, city) values(?,?,?)";
		 * 
		 * // fire query int result = template.update(query,87,"df","GJ");
		 * System.out.println("inserted sucessfully " +result);
		 */
       StudentDao studentDao = context.getBean("studentdao",StudentDao.class);
       Student student = new Student();
       
//      -------------- Insert----------
//       student.setId(666);
//       student.setName("Kamal");
//       student.setCity("Nanakmatta");
//       int result = studentDao.insert(student);
//       System.out.println("Inserted successfully......."+result);
       
//      --------------- Update----------
//       student.setId(666);
//       student.setName("Harish");
//       student.setCity("Hariyana");
//       int show=studentDao.change(student);
//       System.out.println("Update completed............"+show);
       
//       ------------------Delete--------------
//       int remove = studentDao.delete(666);
//       System.out.println("Deleted successfully....."+remove);
       
//       -------get single--------
//       Student student1=studentDao.getstudent(222);
//       System.out.println("data is "+student1);
       
//       ----------get multiple-------
       List<Student> multiple=studentDao.getAllStudent();
       System.out.println(multiple);
       
        
    }
}

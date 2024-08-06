package com.spring.jdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import com.spring.jdbc.entity.Student;

@Component("studentdao")
public class StudentDaoImpl implements StudentDao {
	
	@Autowired
    private JdbcTemplate jdbcTemplate;

    public int insert(Student student) {
        String query = "INSERT INTO Student(id, name, city) VALUES(?, ?, ?)";
        int result = this.jdbcTemplate.update(query, student.getId(), student.getName(), student.getCity());
        return result;
    }
    @Override
	public int change(Student student) {
    	String query="UPDATE Student set name=? , city=? where id = ?";
    	int replace = this.jdbcTemplate.update(query,  student.getName(), student.getCity(),student.getId());
		return replace;
	}

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
	public int delete(int StudentId) {
		String query="Delete from student where id = ?";
    	int remove = this.jdbcTemplate.update(query,  StudentId);
		return remove;
	}
	@Override
	public Student getstudent(int studentId) {
		String query="Select * from student where id = ?";
		RowMapper<Student> rowMapper= new RowMapperImpl();
    	Student single = this.jdbcTemplate.queryForObject(query, rowMapper,studentId);
		return single;
	}
	@Override
	public List<Student> getAllStudent() {
		String query="Select * from student";
		RowMapper<Student> rowMapper= new RowMapperImpl();
    	List<Student> multiple = this.jdbcTemplate.query(query, rowMapper);
    	
    	return multiple;
	}

	
}

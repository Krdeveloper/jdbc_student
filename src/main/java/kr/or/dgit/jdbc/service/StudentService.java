package kr.or.dgit.jdbc.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;

import kr.or.dgit.jdbc.dao.StudentDao;
import kr.or.dgit.jdbc.dto.Student;
import kr.or.dgit.jdbc.util.ConnectionFactory;

public class StudentService implements StudentDao{
	private static final StudentService instance = new StudentService();
	
	public static StudentService getInstance() {
		return instance;
	}
	

	public StudentService() {}


	@Override
	public Student findStudentById(int studId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertStudent(Student student) {
		// TODO Auto-generated method stub
		Connection connection = ConnectionFactory.getInstance();
		PreparedStatement pstmt;
		String sql = "insert into student values(?,?,?,?)";
		try {
			pstmt = connection.prepareStatement(sql);
			pstmt.setInt(1, student.getStudId());
			pstmt.setString(2, student.getName());
			pstmt.setString(3, student.getEmail());
			pstmt.setTimestamp(4, new Timestamp(student.getDob().getTime()));
			System.out.println(pstmt);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void deleteStudent(int studId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Student> findAllStudents() {
		// TODO Auto-generated method stub
		return null;
	}
	
}

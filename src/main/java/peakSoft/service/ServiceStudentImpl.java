package peakSoft.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import peakSoft.dao.StudentDao;
import peakSoft.model.Student;

import java.util.List;

@Service
public class ServiceStudentImpl implements ServiceStudent {
     private StudentDao studentDao;

    @Autowired
    public ServiceStudentImpl(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public void saveStudent(Student student) {
        studentDao.saveStudent(student);
    }

    @Override
    public List<Student> getStudents(Long id) {
        return studentDao.getStudents(id);
    }

    @Override
    public Student getStudentById(Long id) {
        return studentDao.getStudentById(id);
    }

    @Override
    public void deleteStudent(Long id) {
        studentDao.deleteStudent(id);
    }

    @Override
    public void updateStudent(Long id, Student updatedStudent) {
        studentDao.updateStudent(id, updatedStudent);
    }
}


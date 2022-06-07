package peakSoft.service;

import org.springframework.stereotype.Service;
import peakSoft.model.Student;

import java.util.List;

@Service
public interface ServiceStudent {
    void saveStudent(Student student);

    List<Student> getStudents(Long id);

    Student getStudentById(Long id);

    void deleteStudent(Long id);

    void updateStudent(Long id, Student updatedStudent);
}

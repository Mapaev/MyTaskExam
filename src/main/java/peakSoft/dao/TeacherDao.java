package peakSoft.dao;

import peakSoft.model.Teacher;

import java.util.List;

public interface TeacherDao {
    void saveTeacher(Teacher teacher);

    List<Teacher> getTeachers(Long id);

    Teacher getTeacherById(Long id);

    void deleteTeacher(Long id);

    void updateTeacher(Long id, Teacher updatedTeacher);
}


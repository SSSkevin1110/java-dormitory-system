package com.wkw.mapper;

import com.wkw.entity.Moveout;
import com.wkw.entity.Student;

import java.util.List;

public interface StudentMapper {
    public List<Student> list();
    public List<Student> searchByNumber(String value);
    public List<Student> searchByName(String value);
    public void save(Student student);
    public void update(Student student);
    public void delete(Integer id);
    public List<Integer> findStudentIdByDormitoryId(Integer dormitoryId);
    public void resetDormitoryId(Integer studentId,Integer dormitoryId);
    public List<Student> moveoutList();
    public List<Student> searchForMoveoutByNumber(String value);
    public List<Student> searchForMoveoutByName(String value);
    public void updateStateById(Integer id);
    public void moveout(Moveout moveout);
    public List<Student> findByDormitoryId(Integer dormitoryId);
}

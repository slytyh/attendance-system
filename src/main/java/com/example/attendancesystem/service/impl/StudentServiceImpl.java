package com.example.attendancesystem.service.impl;
import com.example.attendancesystem.service.StudentService;
import com.example.attendancesystem.entity.Student;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class StudentServiceImpl implements StudentService {

    @Override
    public String createStudent(Student student) {
        if (student == null || !StringUtils.hasText(student.getStudentID())) {
            return "创建失败：学号不能为空";
        }
        if (!StringUtils.hasText(student.getName())) {
            return "创建失败：姓名不能为空";
        }
        return "创建成功";
    }
}

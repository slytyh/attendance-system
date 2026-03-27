package com.example.attendancesystem.controller;
import com.example.attendancesystem.entity.Student;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {
    @GetMapping("/student/info")
    public String info(){
        return "姓名 学号 班级";
    }
    @PostMapping("/student/attendance")
    public String attendance(@RequestBody String ID){
        return "学号为"+ID+"的学生打卡成功";
    }
    @GetMapping("/student/course")
    public String course(){
        return "高等数学 线性代数 概率论 ";
    }
    @GetMapping("/student/info/{studentid}")
    public String getStudentByID(@PathVariable String studentid){
        return "查询学号为"+studentid+"的学生信息";
    }
    @GetMapping("/student/list")
    public String searchStudent(
            @RequestParam String className,
            @RequestParam(defaultValue = "1") int page){
        return "搜索班级姓名:"+className+",页码:"+page;
    }
    @PostMapping("/attendance/update")
    public String kaoqin(@RequestBody Student student){
        String studentId = student.getStudentID();
        String studentName = student.getName();
        String className = student.getClassName();
        String status = student.getStatus() != null ? student.getStatus() : "已打卡";
        return "学生 " + studentName + "（学号：" + studentId + "，班级：" + className + "）" + status + "成功";
    }
}

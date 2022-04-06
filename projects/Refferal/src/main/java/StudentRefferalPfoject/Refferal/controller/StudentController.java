package StudentRefferalPfoject.Refferal.controller;

import StudentRefferalPfoject.Refferal.entity.Student;
import StudentRefferalPfoject.Refferal.service.impl.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {

private StudentService studentService;

    public StudentController(StudentService studentService) {
        super();
        this.studentService = studentService;
    }


    @GetMapping("/students")
    public String listStudents(Model model)
    {
        model.addAttribute("students",studentService.getAllStudents());
        return "students";
    }

    //handler method to create new student form

    @GetMapping("/students/new")
    public String createStudentForm(Model model)
    {
        Student student =new Student();
        model.addAttribute("student",student);
        return "create_student";
    }
    @PostMapping("/students")
    public String saveStudent(@ModelAttribute("student") Student student)
    {
        studentService.saveStudent(student);
        return "redirect:/students";
    }

    //handler method to handle update student request

    @GetMapping("/students/edit/{id}")
    public String editStudentForm(@PathVariable Long id, Model model)
    {
        model.addAttribute("student",studentService.getStudentById(id));
        return "edit_student";
    }

    @PostMapping("/students/{id}")
    public String updateStudent(@PathVariable Long id, @ModelAttribute("student") Student student, Model model)
    {
        Student existingStudent =studentService.getStudentById(id);
        existingStudent.setId(id);
        existingStudent.setName(student.getName());
        existingStudent.setCourse(student.getCourse());
        studentService.updateStudent(existingStudent);
        return "redirect:/students";
    }

    //handler method to handle delete student request
    @GetMapping("/students/{id}")
    public String deleteStudent(@PathVariable Long id)
    {
        studentService.deleteStudentById(id);
        return "redirect:/students";
    }
}


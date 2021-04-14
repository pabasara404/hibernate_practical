package lk.earth.hibernate_practical;

import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentDao studentDao;

    @GetMapping
    public List<Student> getAll(){
        return studentDao.findAll();

    }

    @PostMapping
    public Student save(@RequestBody Student student) {
        return studentDao.save(student);

    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Integer id){
        if(studentDao.existsById(id)){
            studentDao.deleteById(id);
        }
    }


}

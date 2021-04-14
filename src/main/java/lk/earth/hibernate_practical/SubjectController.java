package lk.earth.hibernate_practical;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/subjects")
public class SubjectController {

    @Autowired
    SubjectDao subjectDao;

    @GetMapping
    public List<Subject> getAll(){
        return subjectDao.findAll();
    }

    @GetMapping("/{id}")
    public Subject get(@PathVariable Integer id){
        Optional<Subject> optionalSubject=subjectDao.findById(id);

        if(optionalSubject.isEmpty())
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Subject Not Found.");

        return  optionalSubject.get();
        }

        @PostMapping
        @ResponseStatus(HttpStatus.CREATED)
        public Subject add(@RequestBody Subject subject){
            for(Topic topic:subject.getTopicList()) topic.setSubject(subject);

        return subjectDao.save(subject);
        }

        @PutMapping("/{id}")
        public Subject update(@PathVariable Integer id,@RequestBody Subject subject){
        if(!subjectDao.existsById(id))
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Subject not found");

        subject.setId(id);
        for (Topic topic:subject.getTopicList()) topic.setSubject(subject);

        return subjectDao.save(subject);
        }


        @DeleteMapping("/{id}")
        @ResponseStatus(HttpStatus.NO_CONTENT)
        public void delete (@PathVariable Integer id){
        if (!subjectDao.existsById(id))
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Subject not found");
        subjectDao.deleteById(id);
    }
}


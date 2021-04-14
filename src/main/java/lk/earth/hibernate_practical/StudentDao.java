package lk.earth.hibernate_practical;

import org.springframework.data.jpa.repository.JpaRepository;



public interface StudentDao extends JpaRepository<Student, Integer> {

}

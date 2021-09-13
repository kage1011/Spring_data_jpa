package repository;

import entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    @Query(value = "select * from employee", nativeQuery = true)
    List<Employee> getAll();

    @Query(value = "select * from employee where firstname = ?1", nativeQuery = true)
    List<Employee> getListByFirstName(String name);

    @Transactional
    @Modifying
    @Query(value = "insert into employee(firstname) values(?1)", nativeQuery = true)
    void addEmployee(String name);

    @Transactional
    @Modifying
    @Query(value = "update employee set firstname = ?2 where id = ?1", nativeQuery = true)
    void updateEmployee(Integer id, String firstname);

    @Transactional
    @Modifying
    @Query(value = "delete from employee where id = ?1", nativeQuery = true)
    void deleteEmployeeById(Integer id);
}

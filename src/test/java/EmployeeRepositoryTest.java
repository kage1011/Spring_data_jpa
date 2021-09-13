import entity.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import repository.EmployeeRepository;

@SpringBootTest
public class EmployeeRepositoryTest {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Test
    public void getAll() {

        System.out.println("getAll: " + employeeRepository.findAll());
        System.out.println("getListByFirstName: " + employeeRepository.findByFirstName("Hanh"));
    }

    @Test
    public void add() {

        Employee employee = Employee.builder().firstName("khai").build();
        System.out.println("Save Person: " + employeeRepository.save(employee));
    }

    @Test
    public void update() {

        Employee employee = Employee.builder().id(1L).firstName("khai vu").build();
        System.out.println("Update Person: " + employeeRepository.save(employee));
    }

    @Test
    public void delete() {

        employeeRepository.deleteById(1L);
    }

}

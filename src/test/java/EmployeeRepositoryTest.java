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

        System.out.println("getAll: " + employeeRepository.getAll());
        System.out.println("getListByName: " + employeeRepository.getListByFirstName("hanh"));
    }

    @Test
    public void add() {

        employeeRepository.addEmployee("khai");
    }

    @Test
    public void update() {

        employeeRepository.updateEmployee(1, "khai1");
    }

    @Test
    public void delete() {

        employeeRepository.deleteEmployeeById(1);
    }
}

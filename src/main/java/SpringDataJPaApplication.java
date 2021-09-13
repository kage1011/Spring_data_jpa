
import entity.Employee;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import repository.EmployeeRepository;

@SpringBootApplication
public class SpringDataJPaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDataJPaApplication.class, args);
    }
    private void insertEmployee(EmployeeRepository employeeRepository){
        Employee employee = Employee.builder()
                .firstName("Van")
                .lastName("Hung")
                .email("hungvan@gmail.com")
                .build();
        employeeRepository.save(employee);

    }



}

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    private Person person;

    @BeforeEach
    public void setup() {
        person = new Person();
    person.setName("Paul");
    person.setSurname("McCartney");
    person.setBirthDate(new Date(2000));
    person.setAnotherCompanyOwner(true);
    person.setPensioner(true);
    person.setPublicServer(true);
    }

    @Test
    void show_full_name() {
        assertEquals("Paul McCartney", person.fullName());
    }

    @Test
    void test_calculateYearlySalary() {
        person.setSalary(1200);
        assertEquals(14400, person.calculateYearlySalary());
    }

    @Test
    void person_is_MEI() {
        person.setAnotherCompanyOwner(false);
        person.setPensioner(false);
        person.setPublicServer(false);
        assertTrue(person.isMEI());
    }

    @Test
    void person_is_not_MEI() {
        assertFalse(person.isMEI());
    }

}
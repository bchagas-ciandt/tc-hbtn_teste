import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Person {
    private String name;
    private String surname;
    private Date birthDate;
    private float salary;
    private boolean anotherCompanyOwner;
    private boolean pensioner;
    private boolean publicServer;

    public Person() {
    }

    public String fullName() {
        return name + " " + surname;
    }

    public float calculateYearlySalary() {
        return salary * 12;
    }

    public boolean isMEI() {
        boolean isMei = false;
        if (calculateYearlySalary() < 130000 && isMaior() && !anotherCompanyOwner && !pensioner && !publicServer) {
            isMei = true;
        }
        return isMei;
    }

    public boolean isMaior() {
        Calendar cal = GregorianCalendar.getInstance();
        int anoAtual = cal.get((Calendar.YEAR));
        if (anoAtual - birthDate.getYear() >= 18) {
            return true;
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public boolean isAnotherCompanyOwner() {
        return anotherCompanyOwner;
    }

    public void setAnotherCompanyOwner(boolean anotherCompanyOwner) {
        this.anotherCompanyOwner = anotherCompanyOwner;
    }

    public boolean isPensioner() {
        return pensioner;
    }

    public void setPensioner(boolean pensioner) {
        this.pensioner = pensioner;
    }

    public boolean isPublicServer() {
        return publicServer;
    }

    public void setPublicServer(boolean publicServer) {
        this.publicServer = publicServer;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}

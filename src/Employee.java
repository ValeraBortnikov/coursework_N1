public class Employee {
    // Переменные класса Employee
    private String firstName;
    private String lastName;
    private String secondName;
    private float salary;
    private String departments;
    private int id;
    private static int lastId = 1;

    // Данные о сотрудниках
    public Employee(String firstName, String lastName, String secondName, float salary, String departments) {
        this.id = lastId++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.secondName = secondName;
        this.salary = salary;
        this.departments = departments;
    }

    // Получим ID
    public int getId() {
        return id;
    }

    // Получим имя
    public String getFirstName() {
        return firstName;
    }

    // Получим фамилию
    public String getLastName() {
        return lastName;
    }

    // Получим отчество
    public String getSecondName() {
        return secondName;
    }

    // ФИО полностью
    public String getFio() {
        return lastName + " " + firstName + " " + secondName;
    }

    // Получим отдел
    public String getDepartments() {
        return departments;
    }

    // Получим отдел
    public float getSalary() {
        return salary;
    }

    // Изменим отдел
    public void setDepartments(String newName) {
        departments = newName;
    }

    // Изменение зарплаты
    public void setSalaryEmployee(float newSalary) {
        salary = newSalary;
    }

    public void printShortInfo() {
        System.out.println(getFio() + " " + getSalary());
    }

    // Переопределим toString
    @Override
    public String toString() {
        return "Табельный номер: " + this.id + " " +
                "Фамилия: " + this.lastName + " " +
                "Имя: " + this.firstName + " " +
                "Отчество: " + this.secondName + " " +
                "Отдел: " + this.departments + " " +
                "Зарплата: " + this.salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        if (salary != employee.salary) return false;
        return true;
    }
}

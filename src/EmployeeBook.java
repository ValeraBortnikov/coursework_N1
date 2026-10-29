public class EmployeeBook {
    private Employee[] employeesArray = new Employee[10];

    // метод должен найти свободную ячейку в массиве и положить в нее данные нового сотрудника
    public boolean addEmployee(Employee employee) {
        for (int i = 0; i < employeesArray.length; i++) {
            if (employeesArray[i] == null) {
                employeesArray[i] = employee;
                return true;
            }
        }
        return false;
    }

    // Получить список всех сотрудников со всеми данными о них, вывести в консоль значения всех полей, кроме Null
    public void printAllNotNullEmployees() {

        for (Employee element : employeesArray) {
            if (element != null) {
                System.out.println(element.toString());
            }
        }
    }

    // Подсчитать среднее значение зарплат
    public float getAverageSalary() {
        float sum = 0f;
        int count = 0;

        for (Employee element : employeesArray) {
            if (element == null) {
                break;
            }
            sum += element.getSalary();
            count++;
        }

        if (count == 0) {
            return count;
        }

        return sum / count;
    }

    // Вывести значения налогов
    public void getTaxes(String type) {
        for (Employee element : employeesArray) {
            if (element == null) {
                break;
            }

            float salary = element.getSalary();
            float tax;

            switch (type) {
                case "PROPORTIONAL":
                    tax = salary * 0.13f;
                    break;

                case "PROGRESSIVE":
                    if (salary <= 150) {
                        tax = salary * 0.13f;
                    } else if (salary <= 350) {
                        tax = salary * 0.17f;
                    } else {
                        tax = salary * 0.21f;
                    }
                    break;

                default:
                    return;
            }

            System.out.println(element.getFio() + " — зарплата: " + salary
                    + ", налог: " + tax);
        }
    }

    // проиндексировать зарплату всех сотрудников отдела на процент
    public void indexSalaryByDepartment(String department, float percent) {
        float oldSalary;
        for (Employee element : employeesArray) {
            if (element == null) {
                continue;
            }

            if (!element.getDepartments().equals(String.valueOf(department))) {
                continue;
            }

            oldSalary = element.getSalary();
            float newSalary = element.getSalary() * (1 + percent / 100);
            element.setSalaryEmployee(newSalary);
            System.out.printf("Данные сотрудника после индексации = %s, зарплата прошлого периода = %s%n", element, oldSalary);
        }
    }

    // Найти первого сотрудника отдела с зарплатой больше wage
    public void findFirstByDepartmentAndSalary(String department, float wage) {
        for (int i = 0; i < employeesArray.length; i++) {
            Employee element = employeesArray[i];

            if (element == null) {
                break; //
            }

            if (!element.getDepartments().equals(String.valueOf(department))) {
                continue;
            }

            if (element.getSalary() > wage) {
                element.printShortInfo();
                break;
            }
        }
    }

    // Вывести первых employeeNumber сотрудников с зарплатой меньше wage
    public void findFirstBySalaryLessThan(float wage, int employeeNumber) {
        int i = 0;
        int found = 0;

        while (i < employeesArray.length) {
            Employee element = employeesArray[i];

            if (element == null) {
                break;
            }

            if (element.getSalary() < wage) {
                element.printShortInfo();
                found++;

                if (found == employeeNumber) {
                    break;
                }
            }

            i++;
        }
    }

    // Есть ли такой сотрудник в массиве (с точки зрения бухгалтерии — по зарплате)
    public boolean containsEmployee(Employee employee) {
        for (Employee element : employeesArray) {
            if (element == null) {
                break;
            }
            if (element.equals(employee)) {
                return true;
            }
        }
        return false;
    }

    // Получить сотрудника по id
    public Employee getEmployeeById(int id) {
        for (Employee element : employeesArray) {
            if (element == null) {
                break;
            }
            if (element.getId() == id) {
                return element;
            }
        }
        return null;
    }
}

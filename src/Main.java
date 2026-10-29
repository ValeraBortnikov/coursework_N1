//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void getFormatConsoleMessage(boolean needNewLine, String text) {

        String headSeparator = "=".repeat(text.length() + 4);
        String bottomSeparator = "-".repeat(text.length() + 4);

        if (needNewLine) {
            System.out.println();
            System.out.println(headSeparator);
            System.out.println("| " + text + " |");
            System.out.println(bottomSeparator);
        } else {
            System.out.println(headSeparator);
            System.out.println("| " + text + " |");
            System.out.println(bottomSeparator);
        }

    }

    public static void main(String[] args) {

        EmployeeBook employeeBook = new EmployeeBook();

        getFormatConsoleMessage(false, "создаем 11 записей");
        Employee man1 = new Employee("Иванов", "Иван", "Иванович", 100, "1");
        Employee man2 = new Employee("Петров", "Пётр", "Петрович", 150, "2");
        Employee man3 = new Employee("Сидоров", "Сидор", "Сидорович", 200, "3");
        Employee man4 = new Employee("Кузнецов", "Кузьма", "Кузьмич", 50, "1");
        Employee man5 = new Employee("Смирнов", "Семён", "Семёнович", 350, "4");
        Employee man6 = new Employee("Попов", "Павел", "Павлович", 400, "2");
        Employee man7 = new Employee("Васильев", "Василий", "Васильевич", 450, "5");
        Employee man8 = new Employee("Соколов", "Сергей", "Сергеевич", 50, "3");
        Employee man9 = new Employee("Михайлов", "Михаил", "Михайлович", 250, "1");
        Employee man10 = new Employee("Новиков", "Николай", "Николаевич", 120, "4");
        Employee man11 = new Employee("Фёдоров", "Фёдор", "Фёдорович", 380, "2");

        getFormatConsoleMessage(false, "метод должен найти свободную ячейку в массиве и положить в нее данные нового сотрудника");
        System.out.println("Создание сотрудника с табельным № " + man1.getId() + " обработан. Статус = " + employeeBook.addEmployee(man1));
        System.out.println("Создание сотрудника с табельным № " + man2.getId() + " обработан. Статус = " + employeeBook.addEmployee(man2));
        System.out.println("Создание сотрудника с табельным № " + man3.getId() + " обработан. Статус = " + employeeBook.addEmployee(man3));
        System.out.println("Создание сотрудника с табельным № " + man4.getId() + " обработан. Статус = " + employeeBook.addEmployee(man4));
        System.out.println("Создание сотрудника с табельным № " + man5.getId() + " обработан. Статус = " + employeeBook.addEmployee(man5));
        System.out.println("Создание сотрудника с табельным № " + man6.getId() + " обработан. Статус = " + employeeBook.addEmployee(man6));
        System.out.println("Создание сотрудника с табельным № " + man7.getId() + " обработан. Статус = " + employeeBook.addEmployee(man7));
        System.out.println("Создание сотрудника с табельным № " + man8.getId() + " обработан. Статус = " + employeeBook.addEmployee(man8));
        System.out.println("Создание сотрудника с табельным № " + man9.getId() + " обработан. Статус = " + employeeBook.addEmployee(man9));
        System.out.println("Создание сотрудника с табельным № " + man10.getId() + " обработан. Статус = " + employeeBook.addEmployee(man10));
        System.out.println("Создание сотрудника с табельным № " + man11.getId() + " обработан. Статус = " + employeeBook.addEmployee(man11));

        getFormatConsoleMessage(true, "Получить список всех сотрудников со всеми данными о них, вывести в консоль значения всех полей, кроме Null");
        employeeBook.printAllNotNullEmployees();

        getFormatConsoleMessage(true, "Подсчитать среднее значение зарплат");
        System.out.println(employeeBook.getAverageSalary());

        getFormatConsoleMessage(true, "Вывести значения налогов");
        getFormatConsoleMessage(false, "PROPORTIONAL");
        employeeBook.getTaxes("PROPORTIONAL");

        getFormatConsoleMessage(true, "PROGRESSIVE");
        employeeBook.getTaxes("PROGRESSIVE");

        getFormatConsoleMessage(true, "проиндексировать зарплату всех сотрудников отдела на процент");
        employeeBook.indexSalaryByDepartment("1", 0.13f);

        getFormatConsoleMessage(true, "Найти первого сотрудника отдела с зарплатой больше wage");
        employeeBook.findFirstByDepartmentAndSalary("3", 100);

        getFormatConsoleMessage(true, "Вывести первых employeeNumber сотрудников с зарплатой меньше wage");
        employeeBook.findFirstBySalaryLessThan(250f, 5);

        getFormatConsoleMessage(true, "Есть ли такой сотрудник в массиве (с точки зрения бухгалтерии — по зарплате)");
        System.out.println("Есть ли сотрудник " + man1.getFio() + " в массиве = " + employeeBook.containsEmployee(man1));
        System.out.println("Есть ли сотрудник " + man2.getFio() + " в массиве = " + employeeBook.containsEmployee(man2));
        System.out.println("Есть ли сотрудник " + man3.getFio() + " в массиве = " + employeeBook.containsEmployee(man3));
        System.out.println("Есть ли сотрудник " + man4.getFio() + " в массиве = " + employeeBook.containsEmployee(man4));
        System.out.println("Есть ли сотрудник " + man5.getFio() + " в массиве = " + employeeBook.containsEmployee(man5));
        System.out.println("Есть ли сотрудник " + man6.getFio() + " в массиве = " + employeeBook.containsEmployee(man6));
        System.out.println("Есть ли сотрудник " + man7.getFio() + " в массиве = " + employeeBook.containsEmployee(man7));
        System.out.println("Есть ли сотрудник " + man8.getFio() + " в массиве = " + employeeBook.containsEmployee(man8));
        System.out.println("Есть ли сотрудник " + man9.getFio() + " в массиве = " + employeeBook.containsEmployee(man9));
        System.out.println("Есть ли сотрудник " + man10.getFio() + " в массиве = " + employeeBook.containsEmployee(man10));
        System.out.println("Есть ли сотрудник " + man11.getFio() + " в массиве = " + employeeBook.containsEmployee(man11));

        getFormatConsoleMessage(true, "Получить сотрудника по id");
        System.out.println("Результат поиска сотрудника с номером " + man1.getId() + " = " + employeeBook.getEmployeeById(man1.getId()));
        System.out.println("Результат поиска сотрудника с номером " + man2.getId() + " = " + employeeBook.getEmployeeById(man2.getId()));
        System.out.println("Результат поиска сотрудника с номером " + man3.getId() + " = " + employeeBook.getEmployeeById(man3.getId()));
        System.out.println("Результат поиска сотрудника с номером " + man4.getId() + " = " + employeeBook.getEmployeeById(man4.getId()));
        System.out.println("Результат поиска сотрудника с номером " + man5.getId() + " = " + employeeBook.getEmployeeById(man5.getId()));
        System.out.println("Результат поиска сотрудника с номером " + man6.getId() + " = " + employeeBook.getEmployeeById(man6.getId()));
        System.out.println("Результат поиска сотрудника с номером " + man7.getId() + " = " + employeeBook.getEmployeeById(man7.getId()));
        System.out.println("Результат поиска сотрудника с номером " + man8.getId() + " = " + employeeBook.getEmployeeById(man8.getId()));
        System.out.println("Результат поиска сотрудника с номером " + man9.getId() + " = " + employeeBook.getEmployeeById(man9.getId()));
        System.out.println("Результат поиска сотрудника с номером " + man10.getId() + " = " + employeeBook.getEmployeeById(man10.getId()));
        System.out.println("Результат поиска сотрудника с номером " + man11.getId() + " = " + employeeBook.getEmployeeById(man11.getId()));
    }
}
public class Main {
    public static void main(String[] args) {
        homeWork1();
        homeWork2();
        homeWork3();
    }
    public static void homeWork1() {
        String firstName="Ivan";
        String middleName="Ivanovich";
        String lastName="Ivanov";
        System.out.println("ФИО сотрудника — "+lastName+" "+firstName+" "+middleName);
    }
    public static void homeWork2() {
        String fullName="Ivanov Ivan Ivanovich";
        System.out.println("Данные ФИО сотрудника для заполнения отчета — "+fullName.toUpperCase());
    }
    public static void homeWork3() {
        String fullName="Иванов Семён Семёнович";
        if (fullName.contains("ё"))fullName=fullName.replace('ё','е');
        if (fullName.contains("Ё"))fullName=fullName.replace('Ё','Е');
        System.out.println("Данные ФИО сотрудника для заполнения отчета — "+fullName);
    }
}
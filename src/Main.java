public class Main {
    public static void main(String[] args) {
        homeWork1();
        homeWork2();
        homeWork3();
        homeWork3Ver2();
    }
    public static void homeWork1() {
        String firstName="Ivan";
        String middleName="Ivanovich";
        String lastName="Ivanov";
        String fullName=lastName+" "+firstName+" "+middleName;
        System.out.println("ФИО сотрудника — "+fullName);
    }
    public static void homeWork2() {
        String fullName="Ivanov Ivan Ivanovich";
        String upperFullName=fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — "+upperFullName);
    }
    public static void homeWork3() {
        String fullName="Иванов Семён Семёнович";
        if (fullName.contains("ё")){
            fullName=fullName.replace('ё','е');
        }
        if (fullName.contains("Ё")){
            fullName=fullName.replace('Ё','Е');
        }
        System.out.println("Данные ФИО сотрудника для заполнения отчета — "+fullName);
    }
    public static void homeWork3Ver2() {
        String fullName="Иванов Семён Семёнович";
        String fixedFullName=fullName;
        String printFullName;
        boolean flagFixedFullName=false;
        if (fullName.contains("ё")){
            fixedFullName=fixedFullName.replace('ё','е');
            flagFixedFullName=true;
        }
        if (fullName.contains("Ё")){
            fixedFullName=fixedFullName.replace('Ё','Е');
            flagFixedFullName=true;
        }

        if(flagFixedFullName){
            printFullName=fixedFullName;
        }else printFullName=fullName;

        System.out.println("Данные ФИО сотрудника для заполнения отчета — "+printFullName);
    }
}
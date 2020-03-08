import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student potter = new Student("Harry", 9, Faculty.GRIFINDOR);
        Student malphoy = new Student("Drako", 8, Faculty.SLISERIN);
        Student sedrik = new Student("Sedrik", 14, Faculty.PUFFENDUY);
        Student roy = new Student("Roy", 10, Faculty.KOGTEVRAN);

        System.out.println(potter.toString());
        System.out.println();
        System.out.println(malphoy.faculty.toString());
        System.out.println();
        System.out.println(sedrik.toString());
        System.out.println();
        System.out.println(roy.faculty.toString());

        System.out.println(potter.faculty.ordinal());

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("На каком факультет учится Гарри Поттер?");
            for (Faculty f : Faculty.values()) {
                System.out.println(f.ordinal() + " - " + f.name());
            }
            System.out.println("Выберите факультет от 0 до 3");
            int choice = scanner.nextInt();

            Faculty faculty = Faculty.values()[choice];
            if (potter.faculty.ordinal() == faculty.ordinal()) {
                System.out.println("Да, Гарри учится на факультете Гриффиндор");
                break;
            } else {
                System.out.println("Не верно!!!");
            }
        }

    }
}

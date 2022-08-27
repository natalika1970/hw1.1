public class Main {
    public static void main(String[] args) {
        // переменные задача 1
        System.out.println("переменные задача 1");
        var dog = 8;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

        // переменные задача 2
        System.out.println("переменные задача 2");

        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);

        // переменные задача 3
        System.out.println("переменные задача 3");

        var dog1 = 12.0;
        dog1 = dog1 - 3.5;
        System.out.println(dog1);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

        // переменные задача 4
        System.out.println("переменные задача 4");

        var friend = 19;
        friend = (19 + 2)/7;
        System.out.println(friend);

        // переменные задача 5
        System.out.println("переменные задача 5");

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        // переменные задача 6
        System.out.println("переменные задача 6");

        var boxer1Weight = 78.2;
        System.out.println(boxer1Weight);
        var boxer2Weight = 82.7;
        System.out.println(boxer2Weight);
        System.out.println("Общий вес двух боксеров " + (boxer1Weight + boxer2Weight) + " кг ");
        System.out.println("Разница в  весе двух боксеров " + (boxer2Weight - boxer1Weight) + " кг ");

        // переменные задача 7
        System.out.println("переменные задача 7");

        System.out.println("Разница в  весе двух боксеров (пример 1)" + (boxer2Weight - boxer1Weight) + " кг ");
        System.out.println("Разница в  весе двух боксеров (пример 2)" + (boxer2Weight % boxer1Weight) + " кг ");

        // переменные задача 8
        System.out.println("переменные задача 8");

        var totalWorkingHours = 640;
        var hoursPerDay = 8;
        var totalEmployees = totalWorkingHours/hoursPerDay;
        System.out.println ("Всего работников в компании " + totalEmployees + " человек");
        totalEmployees = totalEmployees + 94;
        System.out.println ("Всего работников в компании " + totalEmployees + " человек");
        totalWorkingHours = totalEmployees * hoursPerDay;
        System.out.println ("Если в компании работает " + totalEmployees + "человека, то всего " + totalWorkingHours + " часа работы может быть поделено между сотрудниками ");







    }
}
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        byte alpha = 12;
        short beta = 66;
        int gamma = 5212;
        long delta = 316612;
        float epsilon = 5.4636f;
        double zeta = 2.42141;
        System.out.println("Значение переменной alpha с типом byte равно " + alpha);
        System.out.println("Значение переменной beta с типом short равно " + beta);
        System.out.println("Значение переменной gamma с типом int равно " + gamma);
        System.out.println("Значение переменной delta с типом long равно " + delta);
        System.out.println("Значение переменной epsilon с типом float равно " + epsilon);
        System.out.println("Значение переменной zeta с типом double равно " + zeta);
    }

    public static void task2 () {
        System.out.println("Задача 2");
        double a = 27.124352345;
        long b = 987678965549L;
        float c = 2.786f;
        int d = 569;
        int e = -159;
        int f = 27897;
        short g = 67;
        System.out.println("Значению " + a + " соответствует тип переменной double");
        System.out.println("Значению " + b + " соответствует тип переменной long");
        System.out.println("Значению " + c + " соответствует тип переменной float");
        System.out.println("Значению " + d + " соответствует тип переменной int");
        System.out.println("Значению " + e + " соответствует тип переменной int");
        System.out.println("Значению " + f + " соответствует тип переменной int");
        System.out.println("Значению " + g + " соответствует тип переменной short");
    }
    public static void task3 () {
        System.out.println("Задача 3");
        short class1 = 23;
        short class2 = 27;
        short class3 = 30;
        short sheets = 480;
        int studentsSum = class1 + class2 + class3;
        int sheetsFor1Student = sheets / studentsSum;
        System.out.println("На каждого ученика рассчитано " + sheetsFor1Student + " листов бумаги");
    }
    public static void task4 () {
        System.out.println("Задача 4");
        short efficiency = 16 / 2; //произв. в минуту
        int workTimeMinutes = 20;  //время работы в минутах
        int workTimeHours = 24;    //время работы в часах
        int workTimeDays = 3;      //время работы в днях
        int workTimeMonth = 1;     //время работы в месяцах
        int hoursToMinutes = workTimeHours * 60;
        int daysToMinutes = workTimeDays * 60 * 12;
        int MonthToMinutes = workTimeMonth * 60 * 12 * 30;
        int efficiencyM = workTimeMinutes * efficiency;
        int efficiencyH = hoursToMinutes * efficiency;
        int efficiencyD = daysToMinutes * efficiency;
        int efficiencyMonth = MonthToMinutes * efficiency;
        System.out.println("За " + workTimeMinutes + " минут машина произвела " + efficiencyM + " штук бутылок");
        System.out.println("За " + workTimeHours + " часа машина произвела " + efficiencyH + " штук бутылок");
        System.out.println("За " + workTimeDays + " дня машина произвела " + efficiencyD + " штук бутылок");
        System.out.println("За " + workTimeMonth + " месяц машина произвела " + efficiencyMonth + " штук бутылок");
    }
    public static void task5 () {
        System.out.println("Задача 5");
        short jarTotal = 120;
        byte whiteJar = 2;
        byte brownJar = 4;
        int jarPerClass = whiteJar + brownJar;
        int Classes = jarTotal / jarPerClass;
        int brownJarTotal = Classes * brownJar;
        int whiteJarTotal = Classes * whiteJar;
        System.out.println("В школе, где " + Classes + " классов, нужно " + whiteJarTotal + " банок белой краски и " + brownJarTotal + " банок коричневой краски");
    }
    public static void task6 () {
        System.out.println("Задача 6");
        short bananaW = 80;
        int milkMl = 200;
        short iceCreamW = 100;
        short eggW = 70;
        short banana = 5;
        short iceCream = 2;
        short egg = 4;
        int totalWeightB = bananaW * banana;
        int totalWeightM = milkMl / 100 * 105;
        int totalWeightI = iceCream * iceCreamW;
        int totalWeightE = egg * eggW;
        float totalWeightG = totalWeightB + totalWeightM + totalWeightI + totalWeightE;
        float weightKilo = totalWeightG / 1000;
        System.out.println(totalWeightG + " грамм");
        System.out.println(weightKilo + " кг");
    }
    public static void task7 () {
        System.out.println("Задача 7");
        short weightKilo = 7;
        int weightG = weightKilo * 1000;
        int condition1 = weightG / 250;
        int condition2 = weightG / 500;
        int averageDays = (condition1 + condition2) / 2;
        System.out.println(condition1 + " дней");
        System.out.println(condition2 + " дней");
        System.out.println(averageDays + " день в среднем");
    }
    public static void task8 () {
        System.out.println("Задача 8");
        int mashaSalary = 67760;
        int denisSalary = 83690;
        int kristinSalary = 76230;
        int mashaDifference1 = mashaSalary / 100 * 10;
        int denisDifference1 = denisSalary / 100 * 10;
        int kristinDifference1 = kristinSalary / 100 * 10;
        int mashaSalary2 = mashaSalary + mashaDifference1;
        int denisSalary2 = denisSalary + denisDifference1;
        int kristinSalary2 = kristinSalary + kristinDifference1;
        int mashaDifferenceYear = mashaDifference1 * 12;
        int denisDifferenceYear = denisDifference1 * 12;
        int kristinDifferenceYear = kristinDifference1 * 12;
        System.out.println("Маша теперь получает " + mashaSalary2 + " рублей. Годовой доход вырос на " + mashaDifferenceYear + " рублей");
        System.out.println("Денис теперь получает " + denisSalary2 + " рублей. Годовой доход вырос на " + denisDifferenceYear + " рублей");
        System.out.println("Кристина теперь получает " + kristinSalary2 + " рублей. Годовой доход вырос на " + kristinDifferenceYear + " рублей");
    }
}
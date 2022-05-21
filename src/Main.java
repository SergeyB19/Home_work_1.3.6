public class Main {
    public static void main(String[] args) {
        int age = 23;
        int salary = 58_000;
        if (age>=23)
            //"Мы предоставляем лимит в размере 3 зарплат."
            System.out.println( "Мы готовы выдать вам кредитную карту с лимитом " +salary*3+  " рублей");
        else if (age<=23)
            System.out.println("Мы предоставляем лимит в размере 2 зарплат.");
        else if (age>=80)
            System.out.println("Мы увеличиваем лимит в 1.5 раза.");
    }
}
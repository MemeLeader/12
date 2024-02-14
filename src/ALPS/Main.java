package ALPS;

public class Main{
    public static void main(String[] args){
        Mountain elbrus = new Mountain("Эльбрус", "Россия", 5642);
        Mountain monblan = new Mountain("Монблан", "Франция", 4808);
        Mountain everest = new Mountain("Everest", "Непал", 8848);

        Alpinist[] Group1 = new Alpinist[3];
        Group1[0] =  new Alpinist("Леха", 25, "Питер");
        Group1[1] =  new Alpinist("Лепеха", 99, "Мухосранск");
        Group1[2] =  new Alpinist("Петя", 41, "Челябинск");

        Alpinist[] Group2 = {
                new Alpinist("Бабич", 31, "Одесса"),
        };
        Alpinist[] Group3 = {
                new Alpinist("Кира", 33, "Морио"),
        };
        System.out.println("Участники 1 группы:");
        for(Alpinist e : Group1){
            System.out.println("Имя: " + e.getName() + " | Возраст: " + e.getAge() + " | Город: " + e.getAdres());
        }

        System.out.println("Участники 2 группы:");
        for(Alpinist r : Group2){
            System.out.println("Имя: " + r.getName() + " | Возраст: " + r.getAge() + " | Город: " + r.getAdres());
        }
        System.out.println("Участники 3 группы:");
        for(Alpinist f : Group3){
            System.out.println("Имя: " + f.getName()+ " | Возраст: " + f.getAge()+ " | Город: " + f.getAdres());
        }
    }
}
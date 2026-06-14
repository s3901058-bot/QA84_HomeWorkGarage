import java.util.TreeMap;

public class MainGarage {
    public static void main(String[] args) {
        Cars car1 = new Cars("A123AA77", "TO-1", "BMW-X5-2022", 2022);
        Cars car2 = new Cars("B456BB99", "Repair", "AUDI-A6-2020", 2020);
        Cars car3 = new Cars("C789CC177", "Diagnostics", "MERC-E200-2021", 2021);
        Cars car4 = new Cars("K222KK50", "Body Shop", "TESLA-MODEL3-2023", 2023);
        Cars car5 = new Cars("M333MM199", "TO-2", "TOYOTA-CAMRY-2019", 2019);
        Cars car6 = new Cars("X444XX750", "Repair", "HONDA-CIVIC-2018", 2018);
        Cars car7 = new Cars("H666HH77", "Diagnostics", "PORSCHE-911-2024", 2024);
        Cars car8 = new Cars("O777OO11", "TO-1", "HYUNDAI-CRETA-2021", 2021);
        Cars car9 = new Cars("E111EE777", "Tuning", "FORD-MUSTANG-2015", 2015);
        Cars car10 = new Cars("T888TT88", "Oil Change", "KIA-SPORTAGE-2017", 2017);

        Oner oner1 = new Oner("Alex", "+1 (555) 019-2831", 101, "742 Evergreen Terrace");
        Oner oner2 = new Oner("John", "+1 (555) 014-4920", 102, "221B Baker Street");
        Oner oner3 = new Oner("Sarah", "+1 (555) 017-3821", 103, "12 Grimmauld Place");
        Oner oner4 = new Oner("Elon", "+1 (555) 013-9941", 104, "1000 Rocket Road");
        Oner oner5 = new Oner("Michael", "+1 (555) 012-5811", 105, "1725 Slough Avenue");
        Oner oner6 = new Oner("Emma", "+1 (555) 016-7243", 106, "4 Privet Drive");
        Oner oner7 = new Oner("David", "+1 (555) 018-9122", 107, "56 Ocean Drive");
        Oner oner8 = new Oner("Emily", "+1 (555) 011-2354", 108, "73 Wall Street");
        Oner oner9 = new Oner("Robert", "+1 (555) 015-6677", 109, "128 Pine Crescent");
        Oner oner10 = new Oner("Olivia", "+1 (555) 019-4411", 110, "94 Maple Avenue");

        Garage garage=new Garage("AutoService","Berlin","+49 1415 5519-2831");
        garage.addGarage(car1,oner1);
        garage.addGarage(car2,oner2);
        garage.addGarage(car3,oner3);
         garage.addGarage(car4,oner4);
       garage.addGarage(car5,oner5);
        garage.addGarage(car6,oner6);
        garage.addGarage(car7,oner7);
        garage.addGarage(car8,oner8);
        garage.addGarage(car9,oner9);
        garage.addGarage(car10,oner10);
        garage.printCarsInProcess();
        garage.returnCarToOner("A123AA77");
        garage.printCarsInProcess();


    }
}

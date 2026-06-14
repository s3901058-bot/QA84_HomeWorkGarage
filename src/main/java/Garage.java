import java.util.TreeMap;

public class Garage {
    private String name;
    private String address;
    private String phone;

    private TreeMap<Cars, Oner> garage = new TreeMap<>();


    public Garage(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }


    public void addGarage(Cars cars, Oner oner) {
         boolean isExist = garage.containsKey(cars);
           if (isExist==false) {
            garage.put(cars, oner);
            System.out.println("Add Car " + cars.getRegNum() + " To Garage");
        } else {
            System.out.println("Car " + cars.getRegNum() + " already exists in Garage");
        }
    }

        public void printCarsInProcess() {
        System.out.println("Garage: " + getName());
        System.out.println("Garage Address: " + getAddress());
        System.out.println("Garage Phone: " + getPhone());
        System.out.println("\t\tCars in process: ");

        for (Cars cars : garage.keySet()) {
            System.out.println(cars);
            System.out.println("Owner: " + garage.get(cars));
            System.out.println("--");
        }
        System.out.println("-*-*-*-*-*-*-*--*-*-");
    }


    public void returnCarToOner(String regNumber) {
        for (Cars cars : garage.keySet()) {
            if (regNumber.equals(cars.getRegNum())){
                System.out.println(cars);
                System.out.println("Removing Car : " + garage.get(cars)+" From Garage");
                garage.remove(cars);
                return;
            }
        }

    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    @Override
    public String toString() {
        return "Garage{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", garage=" + garage +
                '}';
    }
}
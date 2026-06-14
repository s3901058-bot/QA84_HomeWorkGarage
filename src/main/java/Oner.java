import java.util.Objects;

public class Oner {
   private String Name;
   private String Phone;
   private int  Id;
   private String  Address;

   public Oner(String name, String phone, int id, String address) {
       Name = name;
       Phone = phone;
       Id = id;
       Address = address;
   }



    @Override
    public String toString() {
        return "Oner{" +
                "Name='" + Name + '\'' +
                ", Phone='" + Phone + '\'' +
                ", Id=" + Id +
                ", Address='" + Address + '\'' +
                '}';
    }



    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }
}

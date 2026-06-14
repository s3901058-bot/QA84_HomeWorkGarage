import java.util.Objects;

public class Cars implements Comparable<Cars> {
    private String regNum;
    private String ServiceType;
    private String code;
    private int year;

  public  Cars(String regNum, String ServiceType, String code, int year) {
      this.regNum = regNum;
      this.ServiceType = ServiceType;
      this.code = code;
      this.year = year;

  }


    @Override
    public String toString() {
        return "Cars{" +
                "regNum='" + regNum + '\'' +
                ", ServiceType='" + ServiceType + '\'' +
                ", code='" + code + '\'' +
                ", year=" + year +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Cars cars = (Cars) o;
        return Objects.equals(getCode(), cars.getCode());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getCode());
    }

    public String getRegNum() {
        return regNum;
    }

    public void setRegNum(String regNum) {
        this.regNum = regNum;
    }

    public String getServiceType() {
        return ServiceType;
    }

    public void setServiceType(String serviceType) {
        ServiceType = serviceType;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public int compareTo(Cars o) {
        return this.regNum.compareTo(o.getRegNum());
    }
}

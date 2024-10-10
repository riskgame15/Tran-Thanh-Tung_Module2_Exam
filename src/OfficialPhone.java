package src;

public class OfficialPhone extends Phone{
    private String ExpDate;
    private String ExpScope;

    public OfficialPhone(int id, String Name, String quantity,String price, String manufactuer, String ExpDate, String ExpScope){
        super(id,Name,quantity,price,manufactuer);
        this.ExpDate = ExpDate;
        this.ExpScope = ExpScope;
    }

    public String getExpDate() {
        return ExpDate;
    }

    public void setExpDate(String expDate) {
        ExpDate = expDate;
    }

    public String getExpScope() {
        return ExpScope;
    }

    public void setExpScope(String expScope) {
        ExpScope = expScope;
    }

    @Override
    public String getPrice() {
        return "";
    }

    @Override
    public String toString() {
        return "OfficialPhone{" +
                "ExpDate='" + ExpDate + '\'' +
                ", ExpScope='" + ExpScope + '\'' +
                '}';
    }
}

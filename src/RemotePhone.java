package src;

public class RemotePhone extends Phone {
    private String status;
    private String Region;
    public RemotePhone(int id, String name, String quantity, String price,String manufacturer, String status, String region) {
        super(id, name, quantity, price, manufacturer);
        this.status = status;
        this.Region = region;
    }


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRegion() {
        return Region;
    }

    public void setRegion(String region) {
        Region = region;
    }


    @Override
    public String getPrice() {
        return "";
    }

    @Override
    public String toString() {
        return "RemotePhone{" +
                "status='" + status + '\'' +
                ", Region='" + Region + '\'' +
                '}';
    }
}

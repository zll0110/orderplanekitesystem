import java.util.Date;

public class Customer {
    private String id;  //没有业务意义
    private  String name;  //旅客姓名
    private  String customerType;  //旅客类型
    private  String phone;  //旅客电话
    private  String cardid;  //旅客身份证号
    private  Date birtherDate ;  //旅客出生日期

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCardid() {
        return cardid;
    }

    public void setCardid(String cardid) {
        this.cardid = cardid;
    }

    public Date getBirtherDate() {
        return birtherDate;
    }

    public void setBirtherDate(Date birtherDate) {
        this.birtherDate = birtherDate;
    }


}

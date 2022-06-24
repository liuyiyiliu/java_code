package com.lyi.bean;

/**
 * @Description: TODO
 * @author: liu yi
 * @date: 2022年06月04日 22:56
 */
public class Business extends User  {
    private String shopName;
    private String  address;



    public Business() {
    }

    public Business(String loginName, String password, String realName, char gender, String phone, double accountNumber, String shopName, String address) {
        super(loginName, password, realName, gender, phone, accountNumber);
        this.shopName = shopName;
        this.address = address;
    }

    public Business(String shopName, String address) {
        this.shopName = shopName;
        this.address = address;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Business{" +
                "shopName='" + shopName + '\'' +
                ", address='" + address + '\'' +
                "} " + super.toString();
    }
}

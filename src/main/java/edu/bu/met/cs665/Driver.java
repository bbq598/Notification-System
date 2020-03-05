package edu.bu.met.cs665;

public class Driver implements DeliveryRequest {
  //set up basic attribute for driver
  private String name; 
  private String number;
  private String carType;
  public String orderStatus;
  
  public Driver() {

  }
  //consturctor to make a new object
  
  public Driver(String name,String number,String cartype) {
    setName(name);
    setNumber(number); 
    setCarType(cartype);

  }
  //getter and setter for the attribute 
  
  public String getName() {
    return name;
  }



  public void setName(String name) {
    this.name = name;
  }



  public String getNumber() {
    return number;
  }



  public void setNumber(String number) {
    this.number = number;
  }



  public String getCarType() {
    return carType;
  }



  public void setCarType(String carType) {
    this.carType = carType;
  }



  public String getOrderStatus() {
    return orderStatus;
  }

  public void setOrderStatus(String orderStatus) {
    this.orderStatus = orderStatus;
  }
  //when there is an new deliveryrequest the driver will get
  //a new order status in clude the shop's name and address.
  
  @Override
  public void update(ConcereteShop shop) {
    // TODO Auto-generated method stub
    setOrderStatus(name + " here is a new order from:\n" 
        + shop.getName() + "\n" + shop.getAddress());
  }




}

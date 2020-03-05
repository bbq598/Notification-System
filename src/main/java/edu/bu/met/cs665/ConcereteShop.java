package edu.bu.met.cs665;

import java.util.LinkedList;

public class ConcereteShop implements Shop { 
  //set name and address 
  private String name;
  private String address;
  //getter and setter for name and address
  
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public String getAddress() {
    return address;
  }
  
  public void setAddress(String address) {
    this.address = address;
  }

  public ConcereteShop() {
  }
  //construction to make new shop object with name and address
  
  public ConcereteShop(String name,String address) {
    setAddress(address);
    setName(name);
  }
  //make a linkedlist to store drive object
  
  LinkedList<Driver> driver = new LinkedList<Driver>();
  //add object to linkedlist
  
  @Override
  public void registerDriver(Driver driver) {
    // TODO Auto-generated method stub
    this.driver.add(driver);
  }
  //remove drive object from linkedlist
  
  @Override
  public void removeDriver(Driver driver) {
    // TODO Auto-generated method stub
    this.driver.remove(driver);
  }
  //call all the driver object's update function that in the linkedlist
  
  @Override
  public void notifyDriver(ConcereteShop shop) {
    // TODO Auto-generated method stub
    for (int i = 0; i < driver.size();i++) {
      driver.get(i).update(shop);
    }
  }
}

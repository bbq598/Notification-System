package edu.bu.met.cs665;

public interface Shop {
  
  public void registerDriver(Driver driver);
  
  public void removeDriver(Driver driver);
  
  public void notifyDriver(ConcereteShop shop);

}

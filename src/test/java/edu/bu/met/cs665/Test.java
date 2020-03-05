package edu.bu.met.cs665;

public class Test {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    ConcereteShop shop = new ConcereteShop("Napoles Restaurant","1233 Bennington St, East Boston, MA 02128");
    //System.out.println(shop.getName() +"\n" + shop.getAddress());
    Driver one = new Driver("Mellows Clerc","349-133-9121","Parisienne");
    Driver two = new Driver("Norbury Shelly","218-642-7707","Suburban");
    Driver three = new Driver("Bream Jamill","202-410-8183","F150");
    Driver four = new Driver("Bayley Katine","958-978-1969","Corvette");
    Driver five = new Driver("McNae Sanson","220-298-4249","SRX");
    shop.registerDriver(one);
    shop.registerDriver(two);
    shop.registerDriver(three);
    shop.registerDriver(four);
    shop.registerDriver(five);
    shop.notifyDriver(shop);
    System.out.println(one.getOrderStatus());
    System.out.println(two.getOrderStatus());
    System.out.println(three.getOrderStatus());
    System.out.println(four.getOrderStatus());
    System.out.println(five.getOrderStatus());
  }

}

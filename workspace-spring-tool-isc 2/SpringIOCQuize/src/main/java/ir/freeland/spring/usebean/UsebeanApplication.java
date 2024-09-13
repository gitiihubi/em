package ir.freeland.spring.usebean;

public class UsebeanApplication {
  public static void main(String[] args) {
    InternetbankServices internetbankServices = new InternetbankServices();

    internetbankServices.doCardToCard("6274.1211.6623.6810","6037.9919.1267.1343");
    }
}

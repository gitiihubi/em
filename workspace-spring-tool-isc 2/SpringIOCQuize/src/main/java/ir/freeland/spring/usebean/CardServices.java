package ir.freeland.spring.usebean;


public class CardServices {
	
  public String cardToCard(String sourceCard, String destinationCard) {
    System.out.println("Transfer from " + sourceCard + " to card " + destinationCard) ;
    return "SUCESS";
  }
  
  public void cardBalance(String cardNumber) {
	    System.out.println("Card balance: " + cardNumber ) ;
	  }
  
}

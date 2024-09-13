package ir.freeland.spring.usebean;

public class InternetbankServices {
	
  public void doCardToCard(String sourceCard, String destinationCard) {
    CardServices cardService = new CardServices();
    DatabaseManagment database = new DatabaseManagment();
    
    String result = cardService.cardToCard(sourceCard, destinationCard);
    database.save( result );
    
  }
}

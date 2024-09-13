package ir.freeland.spring.usebean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InternetbankServices {
	
    private CardServices cardService;	
    private DatabaseManagment database;
    
    @Autowired
	public InternetbankServices(
			CardServices cardServices, 
			DatabaseManagment database) {
		this.cardService = cardServices;
		this.database = database;
	}
    
    
    
  public void doCardToCard(String sourceCard, String destinationCard) {

    
    
    String result = cardService.cardToCard(sourceCard, destinationCard);
    database.save( result );
    
  }
}

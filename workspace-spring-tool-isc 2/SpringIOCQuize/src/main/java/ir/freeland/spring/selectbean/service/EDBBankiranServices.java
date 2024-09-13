package ir.freeland.spring.selectbean.service;

import java.io.File;

public class EDBBankiranServices implements BankiranServices {

	@Override
	public File accountTransaction(String accountNumber) {
		return new File("account-report");
	}
}
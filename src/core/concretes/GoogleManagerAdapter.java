package core.concretes;

import core.abstracts.GoogleService;
import googleEntry.Google;

public class GoogleManagerAdapter implements GoogleService{

	@Override
	public void gLoggin(String message) {
		Google google = new Google();
        google.googleEntry(message);
		
	}

}

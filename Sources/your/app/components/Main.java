package your.app.components;

import com.webobjects.appserver.WOContext;
import your.app.Application;

public class Main extends BaseComponent {

	Application application;

	private String benutzername;
	private String passwort;

	public Main(WOContext context) {
		super(context);

		application = (Application) Application.application();
	}

	public UserListPage anmelden() {

		return application.anmelden(benutzername, passwort);

	}

	public String getLogin() {
		return benutzername;
	}

	public void setLogin(String benutzername) {
		this.benutzername = benutzername;
	}

	public String getPasswort() {
		return passwort;
	}

	public void setPasswort(String passwort) {
		this.passwort = passwort;
	}

	public Main clickOutSide() {
		Main nextPage = pageWithName(Main.class);
		return nextPage;
	}

}
package fr.soat.gwthibernate.client;

import java.util.List;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.RootPanel;

import fr.soat.gwthibernate.client.services.PersonService;
import fr.soat.gwthibernate.client.services.PersonServiceAsync;
import fr.soat.gwthibernate.client.views.Persons;
import fr.soat.gwthibernate.shared.Person;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class GwtHibernate implements EntryPoint {
	/**
	 * The message displayed to the user when the server cannot be reached or
	 * returns an error.
	 */
	private static final String SERVER_ERROR = "An error occurred while "
			+ "attempting to contact the server. Please check your network "
			+ "connection and try again.";

	/**
	 * Create a remote service proxy to talk to the server-side Greeting
	 * service.
	 */
	
	private final PersonServiceAsync personService = GWT
			.create(PersonService.class);

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {

		personService.getAll(new AsyncCallback<List<Person>>() {

			public void onSuccess(List<Person> result) {
				Persons personsView = new Persons(result);
				RootPanel.get().add(personsView);
			}

			public void onFailure(Throwable caught) {
				// TODO Auto-generated method stub

			}
		});

	}
}

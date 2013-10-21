package fr.soat.gwthibernate.client.services;

import java.util.List;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface PersonServiceAsync {

	void getAll(AsyncCallback<List<fr.soat.gwthibernate.shared.Person>> callback);

	void add(fr.soat.gwthibernate.shared.Person person,
			AsyncCallback<Void> callback);

}

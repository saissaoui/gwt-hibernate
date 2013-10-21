package fr.soat.gwthibernate.client.services;

import java.util.List;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

import fr.soat.gwthibernate.shared.Person;




@RemoteServiceRelativePath("personService")
public interface PersonService extends RemoteService {

	public List<Person> getAll();

	public void add(Person person);

}

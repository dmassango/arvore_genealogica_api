package mz.co.dario.core.service.person;

import org.springframework.beans.factory.annotation.Autowired;

import mz.co.dario.core.entity.person.Person;
import mz.co.dario.core.repository.person.IPersonRepository;

public class PersonServiceImp implements IPersonService {

	@Autowired(required=true)
	private IPersonRepository personRepository;

	@Override
	public Person createPerson(Person person) {
		Person created = personRepository.save(person);
		return created;
	}

}

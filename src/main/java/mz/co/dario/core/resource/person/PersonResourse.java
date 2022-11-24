package mz.co.dario.core.resource.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mz.co.dario.core.entity.person.Person;
import mz.co.dario.core.service.person.IPersonService;

@RestController
@RequestMapping("/person")
public class PersonResourse {

	@Autowired
	IPersonService personService;

	@PostMapping("/create/person")
	public ResponseEntity<Person> createPerson(@RequestBody Person person) {
		Person created = personService.createPerson(person);
		return ResponseEntity.status(HttpStatus.CREATED).body(created);
	}

}

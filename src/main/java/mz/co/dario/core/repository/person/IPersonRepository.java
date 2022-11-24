package mz.co.dario.core.repository.person;

import org.springframework.data.jpa.repository.JpaRepository;

import mz.co.dario.core.entity.person.Person;

public interface IPersonRepository extends JpaRepository<Person, Long> {

}

package com.weather.weatheer.api;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.UUID;
import java.util.Optional;
import com.weather.weatheer.model.Person;
import com.weather.weatheer.service.PersonService;
@RequestMapping("api/v1/person")
@RestController
public class PersonController {
private final PersonService personservice;

public PersonController(PersonService personservice) {
    this.personservice = personservice;
}
@PostMapping
public void addPerson(@RequestBody  Person person){
    personservice.addPerson(person);
}
@GetMapping
public List<Person> getallpeople(){
    return personservice.GetAllPeople();
}
@DeleteMapping(path="{id}")
public int deleteperson(@PathVariable("id") UUID id){
    return personservice.deleteperson(id);
}
@GetMapping(path="{id}")
public Optional<Person> getPersonbyID(@PathVariable("id") UUID id) {
    return personservice.getPersonbyID(id);
}
}

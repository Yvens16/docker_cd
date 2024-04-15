package com.yvens_group.ec2_artifactId.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.yvens_group.ec2_artifactId.entity.Person;
import com.yvens_group.ec2_artifactId.repository.PersonRepository;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class Controller {

  private PersonRepository personRepository;

  public Controller(PersonRepository personRepository) {
    this.personRepository = personRepository;
  }

  @PostMapping("/create")
  public Person createUser(@RequestBody Person user) {
    Person person = new Person(user.getName(), user.getAge());
    Person savedPerson = this.personRepository.save(person);
    return savedPerson;
  }

  @GetMapping("/get")
  public String getString(@RequestBody Person user) {
    return "Helllo docker";
  }
}

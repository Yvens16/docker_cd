package com.yvens_group.ec2_artifactId.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yvens_group.ec2_artifactId.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Integer> {

}

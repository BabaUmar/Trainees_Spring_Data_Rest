package com.amalitech.org.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;


import com.amalitech.org.Entity.Trainee;
@RepositoryRestResource(collectionResourceRel="trainee", path="trainee")
public interface TraineeRepository extends JpaRepository<Trainee,Integer>{

}

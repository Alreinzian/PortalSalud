package com.msvcdoctor.doctorservice.repository;

import org.springframework.data.repository.CrudRepository;

import com.msvcdoctor.doctorservice.entity.Doctor;



public interface DoctorRepository extends CrudRepository<Doctor,Integer> {

}

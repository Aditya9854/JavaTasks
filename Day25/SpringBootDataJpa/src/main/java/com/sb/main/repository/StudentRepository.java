package com.sb.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sb.main.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Long>
{

}

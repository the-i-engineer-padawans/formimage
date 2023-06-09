package com.elpatron.form.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.elpatron.form.model.Form;

@Repository
public interface FormRepository extends JpaRepository<Form, Long> {

}

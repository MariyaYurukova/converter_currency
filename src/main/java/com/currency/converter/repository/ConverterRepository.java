package com.currency.converter.repository;

import com.currency.converter.domain.entities.Converter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ConverterRepository extends JpaRepository<Converter,String> {



    List<Converter> findAll();



}

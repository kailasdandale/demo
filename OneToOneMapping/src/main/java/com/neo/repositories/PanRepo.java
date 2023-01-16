package com.neo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.neo.model.Pancard;
@Repository
public interface PanRepo  extends JpaRepository<Pancard, Long>{

}

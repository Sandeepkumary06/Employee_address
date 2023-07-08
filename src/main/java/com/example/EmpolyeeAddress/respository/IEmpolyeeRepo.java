package com.example.EmpolyeeAddress.respository;

import com.example.EmpolyeeAddress.model.Empolyee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmpolyeeRepo extends CrudRepository<Empolyee,Long> {
}

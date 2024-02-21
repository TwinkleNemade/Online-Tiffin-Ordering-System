package com.tiffinordering.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.tiffinordering.model.Address;

@Repository
public interface AddressDao extends JpaRepository<Address, Integer> {

}

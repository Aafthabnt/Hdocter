package com.hospital.Docter.Repository;

import com.hospital.Docter.entities.DocterInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocterInfoRepo extends JpaRepository<DocterInfo,Long> {

}

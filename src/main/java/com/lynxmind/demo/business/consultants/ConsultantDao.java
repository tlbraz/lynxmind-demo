package com.lynxmind.demo.business.consultants;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsultantDao extends JpaRepository<Consultant, String> {
}

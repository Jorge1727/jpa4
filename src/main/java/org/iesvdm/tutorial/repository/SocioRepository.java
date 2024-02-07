package org.iesvdm.tutorial.repository;

import org.iesvdm.tutorial.domain.Socio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SocioRepository extends JpaRepository <Socio, Long>{
}

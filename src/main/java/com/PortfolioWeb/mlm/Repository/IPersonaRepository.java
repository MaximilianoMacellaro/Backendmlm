package com.PortfolioWeb.mlm.Repository;

import com.PortfolioWeb.mlm.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author maxim_b95i8g7
 */
@Repository
public interface IPersonaRepository extends JpaRepository<Persona, Long> {
    
}

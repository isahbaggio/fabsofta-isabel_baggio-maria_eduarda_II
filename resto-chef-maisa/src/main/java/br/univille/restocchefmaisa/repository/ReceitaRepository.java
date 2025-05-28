package br.univille.restocchefmaisa.repository;

import br.univille.restocchefmaisa.model.Receita;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReceitaRepository extends JpaRepository<Receita, Long> {
}

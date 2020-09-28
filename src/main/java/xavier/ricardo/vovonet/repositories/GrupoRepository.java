package xavier.ricardo.vovonet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import xavier.ricardo.vovonet.model.Grupo;

@Repository
public interface GrupoRepository extends JpaRepository<Grupo, String> {

}

package dio.desafio.livraria.repository;

import dio.desafio.livraria.entity.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro, Long> {



}

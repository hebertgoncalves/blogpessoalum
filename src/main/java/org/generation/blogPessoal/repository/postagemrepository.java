package org.generation.blogPessoal.repository;

import org.generation.blogPessoal.model.Postagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface postagemrepository extends JpaRepository<Postagem, Long>
{

}

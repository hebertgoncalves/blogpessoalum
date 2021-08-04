package org.generation.blogPessoal.controller;

import java.util.List;

import org.generation.blogPessoal.model.Postagem;
import org.generation.blogPessoal.repository.postagemrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/postagem")
public class PostagemController {

	@Autowired
	private postagemrepository repository;
	
	@GetMapping
	public ResponseEntity<List<Postagem>>findAll() {
		return ResponseEntity.ok(repository.findAll());
	}

    @PostMapping
    public ResponseEntity<Postagem> savePostagem(@RequestBody Postagem postagem){
    	return ResponseEntity.status(201).body(repository.save(postagem));
    	
    }
    
    
}

package com.ProjetoSpringBoot.course.resources;

import com.ProjetoSpringBoot.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*** para dizer que essa classe é um recurso Web que é implementado
  por um controlador Rest***/
@RestController
@RequestMapping(value = "/users")// dar um nome do recurso la na url

public class UserResource {
    // um método que é um endpoint para acessar os usuarios
    // response entity que é um tipo especifico do Spring pra retornar respostas de requisições web
    @GetMapping // para indicar que esse metodo responde a requisicao do tipo Get do Http
    public ResponseEntity<User> findAll(){
        User u = new User(1L,"Maria", "maria@gmail.com", "999999999", "12345");
        return ResponseEntity.ok().body(u);
    }
}

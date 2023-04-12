package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	
	@GetMapping
     public String hello () {
    	 return "<b> Hello World! </b>";
     }
	@GetMapping("/bsm")
	 public String bsms () {
    	 return "<b> Mentalidade de Crescimento <br /> Persistência <br /> Responsabilidade Pessoal <br /> Orientação ao Futuro <br /> Comunicação <br /> Orientação ao Detalhe<br /> Proatividade <br /> Trabalho em Equipe <br /> Gestão de tempo </b>";
     }
	@GetMapping("/objetivo")
	public String objetivo () {
   	 return "<b> Meus objetivos da semana são: <br />Persistência <br /> Gestão de tempo <br /> Comunicação </b>";
    }

}

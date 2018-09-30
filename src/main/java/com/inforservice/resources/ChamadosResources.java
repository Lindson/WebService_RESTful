package com.inforservice.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inforservice.domain.Chamado;

@RestController
public class ChamadosResources {

	@RequestMapping(value = "/chamados", method = RequestMethod.GET)
	public List<Chamado> listar(){
		
		Chamado c1 = new Chamado("Teste 1");
		Chamado c2 = new Chamado("Teste 2");
		Chamado c3 = new Chamado("Teste 2");
		
		Chamado[] chamado = {c1,c2,c3};
		return Arrays.asList(chamado);
	}
}

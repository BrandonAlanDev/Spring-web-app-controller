package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/app")
public class IndexController {
	@GetMapping({"/index","/","home"})
	public String index(Model model) {
		model.addAttribute("titulo","Clase con Spring");
		Usuario user = new Usuario("Brandon","Carabajal","brandoncarabajal@gmail.com");
		model.addAttribute("usuario",user);
		return "index";
	}
	@GetMapping({"/listar","/list"})
	public String listar(Model model) {
		List<Usuario> lista = new ArrayList();
		model.addAttribute("titulo","Lista de usuarios");
		Usuario user1 = new Usuario("Brandon","Carabajal","brandoncarabajal@gmail.com");
		Usuario user2 = new Usuario("Alex","Jayce","npdelolap@gmail.com");
		Usuario user3 = new Usuario("Martin","Lutherking","mllitgen@gmail.com");
		Usuario user4 = new Usuario("Jhon","Cena","mytimeisnow@gmail.com");
		Usuario user5 = new Usuario("Marito","Baracus","elgranmb@gmail.com");
		Usuario user6 = new Usuario("Mike","Dean","mkforreal@gmail.com");
		lista.add(user1);
		lista.add(user2);
		lista.add(user3);
		lista.add(user4);
		lista.add(user5);
		lista.add(user6);
		model.addAttribute("usuario",lista);
		return "listar";
	}
}

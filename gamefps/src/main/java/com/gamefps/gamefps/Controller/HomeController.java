package com.gamefps.gamefps.Controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.game.fps.gamefps.Model.Jogo;


@Controller
public class HomeController {
	
	@GetMapping("/index")
    public ModelAndView index() {
        ModelAndView modelView = new ModelAndView("index");

       Jogo jogo1 = new Jogo ("Valorant", "Jogo da Riot", 59);
       Jogo jogo2 = new Jogo ("Warzone", "Jogo da Activision", 149);

        List<Jogo> jogos = Arrays.asList(jogo1,jogo2);
        modelView.addObject("listarjogos", jogos);

        return modelView;
    }
	
}
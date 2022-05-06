package it.economicaircompany.mvc.controller.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import it.economicaircompany.mvc.service.PrenotazioneService;

@Controller
@RequestMapping("/web")
public class PrenotazioneControllerWeb {

	@Autowired
	PrenotazioneService prenotazioneService;
	
	Logger logger = LoggerFactory.getLogger(PrenotazioneControllerWeb.class);
	
	@GetMapping("/prenotazioni")
	public ModelAndView getAllPrenotazioni() {
		ModelAndView modelPrenotazioni = new ModelAndView();
		modelPrenotazioni.setViewName("prenotazioni");
		modelPrenotazioni.addObject("listaPrenotazioni", prenotazioneService.getAllPrenotazioni());
		return modelPrenotazioni;
	}
}

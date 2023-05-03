package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.models.FruitDTO;

@Controller
@RequestMapping("/API/Fruit")
public class FruitController {

	@GetMapping("{sw}")
	public String viewfruit(@PathVariable("sw") String sw, Model model) {
		String titulo = "P{agina API con SprinBot";
		model.addAttribute("name", sw);
		model.addAttribute("titulo", titulo);
		FruitDTO starFruiiewtDTO = starFruitResultDTO (sw);
		model.addAttribute("starFrutiewtDTO", starFruiiewtDTO);
		return "viewfruit";
	}
	
	public FruitDTO starFruitResultDTO(String sw) {
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<FruitDTO> resp =
				restTemplate.getForEntity(
						String.format("https://fruityvice.com/api/fruit/%s", sw), FruitDTO.class);
		//model.addAttribute("respCesp", resp);
		return resp.getBody();
	}
	
}
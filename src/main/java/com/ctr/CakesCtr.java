//package com.ctr;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PatchMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//
//import com.dao.CakesRepository;
//import com.model.Cakes;
//
//@Controller
//public class CakesCtr {
//	
//	@Autowired
//	private CakesRepository cakesRep;
//	
//	@GetMapping("/all-cakes")
//	public String getAllCakes(Model model){
//		List<Cakes> listAllCakes = cakesRep.findAll();
//		model.addAttribute("listAllCakes", listAllCakes);
//		return "/all-cakes";
//	}
//	
//	///ADD
//	@PostMapping("/add-cakes")
//	public String addCakes(Model model, Cakes cakes) {
//		cakesRep.save(cakes);
//		return "/add-success";
//	}
//	
//	///DELETE by ID
//	@GetMapping("delete-cakes")
//	public String deleteCakes(Model model, Integer idCakes) {
//		Cakes cakes = (Cakes) cakesRep.findById(idCakes).orElse(null);
//		if(cakes != null) {
//			cakesRep.delete(cakes);
//			return "/delete-success";
//		}else {
//			String errorMessage = "ops!";
//			model.addAttribute("errorMessage", errorMessage);
//			return "/error";
//		}
//	}
//	
//	//UPDATE
//	@GetMapping("/update-cakes")
//	public String updateCakes(Model model, @RequestParam Integer idCakes) {
//		Cakes cakes = cakesRep.findById(idCakes).orElse(null);
//		model.addAttribute("idCakes", cakes);
//		return "/update-cakes";
//	}
//	@PatchMapping("/update-cakes")
//	public String updateCakes(Model model, Cakes cakes) {
//		cakesRep.save(cakes);
//		return("/update-success");
//	}
//	
//	//FIND BY TYPE OF CAKE
//	@GetMapping("/search-type-cakes")
//	public String searchByType(Model model, String typeOfCake) {
//		List<Cakes> cakes = cakesRep.findByTypeOfCake(typeOfCake);
//		model.addAttribute("typeOfCake", cakes);
//		if(cakes!= null) {
//		return "/results-type-cakes";
//		}else {
//			String errorMessage = "ops!";
//			model.addAttribute("errorMessage", errorMessage);
//			return "/error";
//		}
//	}
//	
//	//FIND BY SIZE
//	@GetMapping("/search-size-cakes")
//	public String searchBySize(Model model, String size) {
//		List<Cakes> cakes = cakesRep.findBySize(size);
//		model.addAttribute("size", cakes);
//		if(cakes != null) {
//			return ("/results-sizes-cakes");
//		}else {
//			String errorMessage = "ops!";
//			model.addAttribute("errorMessage", errorMessage);
//			return "/error";
//		}
//	}
//	
//	//FIND BY NAME
//	@GetMapping("/search-name-cake")
//	public String searchByName(Model model, String name) {
//		List<Cakes> cakes = cakesRep.findByName(name);
//		model.addAttribute("name", cakes);
//		if(cakes != null) {
//			return ("/results-name-cakes");
//		}else {
//			String errorMessage = "ops!";
//			model.addAttribute("errorMessage", errorMessage);
//			return "/error";
//		}
//	}
//}

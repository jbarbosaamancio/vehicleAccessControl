package br.jbit.vehicleAccessControlApp.Domain.Controllers;

import br.jbit.vehicleAccessControlApp.Domain.Entities.Concierge;
import br.jbit.vehicleAccessControlApp.Domain.Repository.IConciergeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


public abstract class CoreController {

    private IConciergeRepository conciergeRepository;


    @GetMapping({"/", "/home"})
    public ModelAndView home(){
        ModelAndView homeView = new ModelAndView("viewpages/home.html")
                .addObject("concierges", conciergeRepository.findAll());
        return homeView;
    }
    @GetMapping({"/", "/home"})
    public ModelAndView home(@RequestParam(defaultValue = "") String plate){

            ModelAndView homeView = new ModelAndView("viewpages/home.html")
                    .addObject("concierges", conciergeRepository.findByVehiclePlate(plate));
            return homeView;
    }

    @GetMapping("/register")
    public ModelAndView registerVehicle(){

        ModelAndView registerVehicleView = new ModelAndView("viewpages/register.html")
                .addObject("concierge", new Concierge());
        return registerVehicleView;
    }

    @PostMapping("/register")
    public String registerVehicle(Concierge concierge, Model model){
        conciergeRepository.save(concierge);

        return "redirect:/home";
    }

    @GetMapping("/edit/{id}")
    public ModelAndView editVehicle(@PathVariable("id") Long id){

        Concierge concierge = conciergeRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Id: Not provided" + id));

        ModelAndView editVehicleView = new ModelAndView("viewpages/edit.html")
                .addObject("concierge", concierge );
        return editVehicleView;
    }

    @PostMapping("/edit/{id}")
    public String editVehicle(@PathVariable("id") Long id, Concierge concierge){
        conciergeRepository.save(concierge);
        return "redirect:/home";
    }

    @GetMapping("/view/{id}")
    public ModelAndView viewVehicle(@PathVariable("id") Long id){
        Concierge concierge = conciergeRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Id: Not provided" + id));

        ModelAndView viewVehicleView = new ModelAndView("viewpages/view.html")
                .addObject("concierge", concierge);
        return viewVehicleView;
    }



}

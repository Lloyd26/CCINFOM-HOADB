package ccinfom.hoa.controller;

import ccinfom.hoa.repository.HomeownerRepository;
import ccinfom.hoa.repository.PeopleRepository;
import ccinfom.hoa.repository.PropertyRepository;
import ccinfom.hoa.repository.ZipcodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @Autowired
    private HomeownerRepository homeownerRepository;

    @Autowired
    private PeopleRepository peopleRepository;
    @Autowired
    private PropertyRepository propertyRepository;
    @Autowired
    private ZipcodeRepository zipcodeRepository;

    @GetMapping("/")
    public String getMain(Model model) {
        model.addAttribute("homeowners_count", homeownerRepository.count());
        model.addAttribute("people_count", peopleRepository.count());
        model.addAttribute("properties_count", propertyRepository.count());
        model.addAttribute("recent_people", peopleRepository.getRecentPeople(5));
        model.addAttribute("zipcodes", zipcodeRepository.findAll());
        return "index";
    }
}

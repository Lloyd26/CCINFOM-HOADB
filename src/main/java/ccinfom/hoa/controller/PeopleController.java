package ccinfom.hoa.controller;

import ccinfom.hoa.repository.PeopleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PeopleController {

    @Autowired
    private PeopleRepository repository;

    @GetMapping("/people")
    public String getIndividuals(Model model) {
        model.addAttribute("people", repository.findAll(Sort.by(Sort.Direction.ASC, "id")));
        return "people";
    }
}

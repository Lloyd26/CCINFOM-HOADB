package ccinfom.hoa.controller;

import ccinfom.hoa.model.Hoa;
import ccinfom.hoa.repository.AssetRepository;
import ccinfom.hoa.repository.HoaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.stream.Collectors;

@Controller
@RequestMapping("/assets")
public class AssetsController {
    private final AssetRepository assetRepository;
    private final HoaRepository hoaRepository;

    public AssetsController(AssetRepository assetRepository,
                            HoaRepository hoaRepository) {
        this.assetRepository = assetRepository;
        this.hoaRepository = hoaRepository;
    }

    @GetMapping
    public String getMain(Model model) {
        model.addAttribute("nav_page", "Assets");
        model.addAttribute("page_title", "Assets");
        model.addAttribute("assets", assetRepository.findAll());
        return "assets";
    }

    @GetMapping("/create")
    public String getCreate(Model model) {
        model.addAttribute("hoa_name", hoaRepository.findAll().stream().map(Hoa::getId).collect(Collectors.toList()));
        return "create_asset";
    }
}

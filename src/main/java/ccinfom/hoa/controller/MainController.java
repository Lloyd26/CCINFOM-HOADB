package ccinfom.hoa.controller;

import ccinfom.hoa.repository.*;
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
    @Autowired
    private OutsiderRepository outsiderRepository;
    @Autowired
    private OfficerRepository officerRepository;
    @Autowired
    private AssetRepository assetRepository;
    @Autowired
    private AssetActivityRepository assetActivityRepository;
    @Autowired
    private AssetTransactionRepository assetTransactionRepository;
    @Autowired
    private AssetRentalRepository assetRentalRepository;
    @Autowired
    private AssetTransferRepository assetTransferRepository;
    @Autowired
    private DonorRepository donorRepository;
    @Autowired
    private DonatedAssetRepository donatedAssetRepository;
    @Autowired
    private DonationPictureRepository donationPictureRepository;
    @Autowired
    private AssetDonationRepository assetDonationRepository;

    @GetMapping("/")
    public String getMain(Model model) {
        model.addAttribute("nav_page", "Dashboard");
        model.addAttribute("page_title", "Dashboard");
        model.addAttribute("homeowners_count", homeownerRepository.count());
        model.addAttribute("people_count", peopleRepository.count());
        model.addAttribute("properties_count", propertyRepository.count());
        model.addAttribute("officers_count", officerRepository.count());
        model.addAttribute("recent_assets", assetRepository.findAllLimit(10));
        model.addAttribute("recent_donations", assetDonationRepository.findAllLimit(10));
        return "index";
    }
}

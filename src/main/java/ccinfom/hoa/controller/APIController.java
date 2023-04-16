package ccinfom.hoa.controller;

import ccinfom.hoa.model.Asset;
import ccinfom.hoa.model.Gender;
import ccinfom.hoa.model.Hoa;
import ccinfom.hoa.model.People;
import ccinfom.hoa.repository.AssetRepository;
import ccinfom.hoa.repository.PeopleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.math.BigDecimal;
import java.net.URI;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class APIController {

    @Autowired
    private PeopleRepository peopleRepository;
    @Autowired
    private AssetRepository assetRepository;

    @GetMapping("people")
    public @ResponseBody List<People> getPeople() {
        return peopleRepository.findAll(Sort.by(Sort.Direction.ASC, "id"));
    }

    @GetMapping("people/{id}")
    public @ResponseBody Optional<People> getPeopleById(@PathVariable int id) {
        return peopleRepository.findById(id);
    }

    @PostMapping("people")
    public @ResponseBody ResponseEntity<People> createNewPeople(
            @RequestParam String first_name,
            @RequestParam String last_name,
            @RequestParam Gender gender,
            @RequestParam String email,
            @RequestParam String facebook,
            @RequestParam String pictureFile,
            @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date birthday) throws IOException {
        peopleRepository.save(new People(
                last_name, first_name,
                gender, email,
                facebook, pictureFile,
                birthday
        ));
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(URI.create("/individuals"));
        return new ResponseEntity<>(headers, HttpStatus.CREATED);
    }

    /*@PostMapping("individuals")
    public @ResponseBody List<People> createIndividual(People newIndividual) {
        peopleRepository.save(newIndividual);
        //return new ResponseEntity<>(newIndividual, HttpStatus.CREATED);
        return peopleRepository.findAll();
    }*/

    @GetMapping("assets")
    public @ResponseBody List<Asset> getAssets() {
        return assetRepository.findAll(Sort.by(Sort.Direction.ASC, "id"));
    }

    @PostMapping("assets")
    public @ResponseBody ResponseEntity<Asset> createNewAsset(
            @RequestParam Integer assetId,
            @RequestParam String assetName,
            @RequestParam String assetDescription,
            @RequestParam LocalDate acquisitionDate,
            @RequestParam Boolean forrent,
            @RequestParam BigDecimal assetValue,
            @RequestParam String typeAsset,
            @RequestParam String status,
            @RequestParam BigDecimal locLattitude,
            @RequestParam BigDecimal locLongitude,
            @RequestParam Hoa hoaName,
            @RequestParam(required = false) Asset enclosingAsset) {
        Asset asset = new Asset();
        asset.setId(assetId);
        asset.setAssetName(assetName);
        asset.setAssetDescription(assetDescription);
        asset.setAcquisitionDate(acquisitionDate);
        asset.setForrent(forrent);
        asset.setAssetValue(assetValue);
        asset.setTypeAsset(typeAsset);
        asset.setStatus(status);
        asset.setLocLattitude(locLattitude);
        asset.setLocLongitude(locLongitude);
        asset.setHoaName(hoaName);
        asset.setEnclosingAsset(enclosingAsset);
        assetRepository.save(asset);
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(URI.create("/assets"));
        return new ResponseEntity<>(headers, HttpStatus.CREATED);
    }
}

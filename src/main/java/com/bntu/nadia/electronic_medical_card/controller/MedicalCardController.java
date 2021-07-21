package com.bntu.nadia.electronic_medical_card.controller;

import com.bntu.nadia.electronic_medical_card.facade.IAuthenticationFacade;
import com.bntu.nadia.electronic_medical_card.model.medical_card.*;
import com.bntu.nadia.electronic_medical_card.service.medical_card.*;
import com.bntu.nadia.electronic_medical_card.service.user.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Date;
import java.util.List;

@Controller
public class MedicalCardController {

    @Autowired
    private UserService userService;

    @Autowired
    private PersonalPageService personalPageService;

    @Autowired
    private AnamnesisPageService anamnesisPageService;

    @Autowired
    private DiagnosisPageService diagnosisPageService;

    @Autowired
    private GynecologicalPageService gynecologicalPageService;

    @Autowired
    private MedicalExaminationPageService medicalExaminationPageService;

    @Autowired
    private VaccinationPageService vaccinationPageService;

    @Autowired
    private XRayPageService xRayPageService;

    @Autowired
    private TemporaryDisabilityPageService temporaryDisabilityPageService;

    @Autowired
    private MedicalCardService medicalCardService;

    @Autowired
    private IAuthenticationFacade authenticationFacade;

    @GetMapping(value = {"/personal_page/{id}"})
    public String personalPage(ModelMap model, @PathVariable String id) {

        PersonalPage personalPage = personalPageService.findByPatientId(Long.parseLong(id));
        model.addAttribute("personalPage", personalPage);//для отображения на странице данных полученных из бд

        return "/medical_card/personal_page";
    }

    @GetMapping(value = {"/diagnosis/{id}"})
    public String diagnosis(ModelMap model, @PathVariable String id) {

        model.addAttribute("diagnosisPage", new DiagnosisPage());//для постзапроса

        List<DiagnosisPage> diagnosisPage = diagnosisPageService.findByPatientId(Long.parseLong(id));
        model.addAttribute("diagnoses", diagnosisPage);//для отображения на странице данных полученных из бд

        return "/medical_card/diagnosis";
    }

    @PostMapping(value = {"/diagnosis/{id}"})
    public String saveDiagnosis(ModelMap model, @PathVariable String id, @ModelAttribute("diagnosisPage") DiagnosisPage diagnosisPage, BindingResult bindingResult) {

        Authentication authentication = authenticationFacade.getAuthentication();

        diagnosisPage.setMedicalCard(medicalCardService.findByPatientId(Long.parseLong(id)));
        diagnosisPage.setMedicalWorker(userService.findUserByUsername(authentication.getName()));
        diagnosisPage.setRecordDate(new Date());

        diagnosisPageService.save(diagnosisPage);

        return diagnosis(model, id);
    }

    @GetMapping(value = {"/anamnesis/{id}"})
    public String anamnesis(Model model, @PathVariable String id) {

        model.addAttribute("anamnesisPage", new AnamnesisPage());

        List<AnamnesisPage> anamnesisPages = anamnesisPageService.findByPatientId(Long.parseLong(id));
        model.addAttribute("anamnesis", anamnesisPages);

        return "medical_card/anamnesis";
    }

    @PostMapping(value = {"/anamnesis/{id}"})
    public String saveAnamnesis(Model model, @PathVariable String id, @ModelAttribute("anamnesisPage") AnamnesisPage anamnesisPage, BindingResult bindingResult) {

        Authentication authentication = authenticationFacade.getAuthentication();

        anamnesisPage.setMedicalCard(medicalCardService.findByPatientId(Long.parseLong(id)));
        anamnesisPage.setMedicalWorker(userService.findUserByUsername(authentication.getName()));
        anamnesisPage.setRecordDate(new Date());

        anamnesisPageService.save(anamnesisPage);

        return anamnesis(model, id);
    }

    @GetMapping(value = {"/disability/{id}"})
    public String disability(Model model, @PathVariable String id) {

        model.addAttribute("disabilityPage", new TemporaryDisabilityPage());

        List<TemporaryDisabilityPage> temporaryDisabilityPages = temporaryDisabilityPageService.findByPatientId(Long.parseLong(id));
        model.addAttribute("disability", temporaryDisabilityPages);

        return "medical_card/disability";
    }

    @PostMapping(value = {"/disability/{id}"})
    public String saveDisability(Model model, @PathVariable String id, @ModelAttribute("disabilityPage") TemporaryDisabilityPage temporaryDisabilityPage, BindingResult bindingResult) {

        Authentication authentication = authenticationFacade.getAuthentication();

        temporaryDisabilityPage.setMedicalCard(medicalCardService.findByPatientId(Long.parseLong(id)));
        temporaryDisabilityPage.setMedicalWorker(userService.findUserByUsername(authentication.getName()));
        temporaryDisabilityPage.setRecordDate(new Date());

        temporaryDisabilityPageService.save(temporaryDisabilityPage);

        return disability(model, id);
    }

    @GetMapping(value = {"/gynecological/{id}"})
    public String gynecological(Model model, @PathVariable String id) {

        model.addAttribute("gynecologicalPage", new GynecologicalPage());

        List<GynecologicalPage> gynecologicalPages = gynecologicalPageService.findByPatientId(Long.parseLong(id));
        model.addAttribute("gynecological", gynecologicalPages);

        return "medical_card/gynecological";
    }

    @PostMapping(value = {"/gynecological", "/gynecological/{id}"})
    public String saveGynecological(Model model, @PathVariable String id, @ModelAttribute("gynecologicalPage") GynecologicalPage gynecologicalPage, BindingResult bindingResult) {

        Authentication authentication = authenticationFacade.getAuthentication();

        gynecologicalPage.setMedicalCard(medicalCardService.findByPatientId(Long.parseLong(id)));
        gynecologicalPage.setMedicalWorker(userService.findUserByUsername(authentication.getName()));
        gynecologicalPage.setRecordDate(new Date());

        gynecologicalPageService.save(gynecologicalPage);

        return gynecological(model, id);
    }

    @GetMapping(value = {"/xray/{id}"})
    public String xray(Model model, @PathVariable String id) {

        model.addAttribute("xrayPage", new XRayPage());

        List<XRayPage> xRayPages = xRayPageService.findByPatientId(Long.parseLong(id));
        model.addAttribute("xray", xRayPages);

        return "medical_card/xray";
    }

    @PostMapping(value = {"/xray/{id}"})
    public String saveXray(Model model, @PathVariable String id, @ModelAttribute("xrayPage") XRayPage xRayPage, BindingResult bindingResult) {

        Authentication authentication = authenticationFacade.getAuthentication();

        xRayPage.setMedicalCard(medicalCardService.findByPatientId(Long.parseLong(id)));
        xRayPage.setMedicalWorker(userService.findUserByUsername(authentication.getName()));
        xRayPage.setRecordDate(new Date());

        xRayPageService.save(xRayPage);

        return xray(model, id);
    }

    @GetMapping(value = {"/medical_examination/{id}"})
    public String medicalExamination(Model model, @PathVariable String id) {

        model.addAttribute("medicalExaminationPage", new MedicalExaminationPage());

        List<MedicalExaminationPage> medicalExaminationPages = medicalExaminationPageService.findByPatientId(Long.parseLong(id));
        model.addAttribute("medicalExamination", medicalExaminationPages);

        return "/medical_card/medical_examination";
    }

    @PostMapping(value = {"/medical_examination/{id}"})
    public String saveMedicalExamination(Model model, @PathVariable String id, @ModelAttribute("medicalExaminationPage") MedicalExaminationPage medicalExaminationPage, BindingResult bindingResult) {

        Authentication authentication = authenticationFacade.getAuthentication();

        medicalExaminationPage.setMedicalCard(medicalCardService.findByPatientId(Long.parseLong(id)));
        medicalExaminationPage.setTreatmentDoctor(userService.findUserByUsername(authentication.getName()));
        medicalExaminationPage.setRecordDate(new Date());

        medicalExaminationPageService.save(medicalExaminationPage);

        return medicalExamination(model, id);
    }

    @GetMapping(value = {"/vaccination/{id}"})
    public String vaccination(Model model, @PathVariable String id) {

        model.addAttribute("vaccinationPage", new VaccinationPage());

        List<VaccinationPage> vaccinationPages = vaccinationPageService.findByPatientId(Long.parseLong(id));
        model.addAttribute("vaccination", vaccinationPages);

        return "/medical_card/vaccination";
    }

    @PostMapping(value = {"/vaccination/{id}"})
    public String saveVaccination(Model model, @PathVariable String id, @ModelAttribute("vaccinationPage") VaccinationPage vaccinationPage, BindingResult bindingResult) {

        Authentication authentication = authenticationFacade.getAuthentication();

        vaccinationPage.setMedicalCard(medicalCardService.findByPatientId(Long.parseLong(id)));
        vaccinationPage.setMedicalWorker(userService.findUserByUsername(authentication.getName()));
        vaccinationPage.setRecordDate(new Date());

        vaccinationPageService.save(vaccinationPage);

        return vaccination(model, id);
    }

}

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
    private PreventiveExaminationPageService preventiveExaminationPageService;

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

    @GetMapping(value = {"/personal_page", "/personal_page/{id}"})
//    @ResponseBody
    public String personalPage(ModelMap model, @PathVariable(required = false) String id) {

        PersonalPage personalPage;

        if (id == null) {
            Authentication authentication = authenticationFacade.getAuthentication();
            personalPage = personalPageService.findByPatientUsername(authentication.getName());

        } else {
            personalPage = personalPageService.findByPatientId(Long.parseLong(id));
        }

//        PersonalPage personalPage = new PersonalPage();
//        personalPage.setId(3389);
//        personalPage.setName("Анна");
//        personalPage.setSurname("Мармузевич");
//        personalPage.setPatronymic("Васильевна");
//        personalPage.setGender(Gender.WOMAN);
//        personalPage.setDateOfBirth(new GregorianCalendar(2000, 10, 10));
//        personalPage.addPhoneNumber(new PhoneNumber("+375333995300"));
//        personalPage.setAddress(new Address("Витебская", "Миорский", "д. Белорусская", "Центральная", "2"));
//        personalPage.setWorkPlace("EPAM Systems");
//        personalPage.setPosition("Java-developer");
//        personalPage.addDispensaryObservationGroup(new DispensaryObservationGroup(DispensaryGroup.D_ONE));

        model.addAttribute("id", personalPage.getId());
        model.addAttribute("name", personalPage.getName());
        model.addAttribute("surname", personalPage.getSurname());
        model.addAttribute("patronymic", personalPage.getPatronymic());
//        model.addAttribute("birthday", personalPage.getDateOfBirth().getDisplayName(1,1, Locale.getDefault()));
//        model.addAttribute("gender", personalPage.getGender().getRussianValue());
//        model.addAttribute("phoneNumber", personalPage.getPhoneNumbers());
        model.addAttribute("region", personalPage.getAddress().getRegion());
        model.addAttribute("district", personalPage.getAddress().getDistrict());
        model.addAttribute("locality", personalPage.getAddress().getLocality());
        model.addAttribute("street", personalPage.getAddress().getStreet());
        model.addAttribute("homeNumber", personalPage.getAddress().getHomeNumber());
        model.addAttribute("caseNumber", personalPage.getAddress().getCaseNumber());
        model.addAttribute("flatNumber", personalPage.getAddress().getFlatNumber());
        model.addAttribute("workPlace", personalPage.getWorkPlace());
        model.addAttribute("position", personalPage.getPosition());
//        model.addAttribute("dispensaryGroup", personalPage.getDispensaryObservationGroup());

        if (personalPage.getPrivilegedGroup() == null) {
            model.addAttribute("privileged", "нет");
        } else {
            model.addAttribute("privileged", personalPage.getPrivilegedGroup());
        }

        return "/medical_card/personal_page";
    }

    @GetMapping(value = {"/diagnosis", "/diagnosis/{id}"})
    public String diagnosis(ModelMap model, @PathVariable(required = false) String id) {

        model.addAttribute("diagnosisPage", new DiagnosisPage());//для постзапроса

        List<DiagnosisPage> diagnosisPage;

        if (id == null) {
            Authentication authentication = authenticationFacade.getAuthentication();
            diagnosisPage = diagnosisPageService.findByPatientUsername(authentication.getName());

        } else {

            diagnosisPage = diagnosisPageService.findByPatientId(Long.parseLong(id));
        }

        model.addAttribute("diagnoses", diagnosisPage);

        return "/medical_card/diagnosis";
    }

    @PostMapping(value = {"/diagnosis", "/diagnosis/{id}"})
    public String saveDiagnosis(ModelMap model, @PathVariable(required = false) String id, @ModelAttribute("diagnosisPage") DiagnosisPage diagnosisPage, BindingResult bindingResult) {

        Authentication authentication = authenticationFacade.getAuthentication();

        diagnosisPage.setMedicalCard(medicalCardService.findByPatientId(Long.parseLong(id)));
        diagnosisPage.setMedicalWorker(userService.findUserByUsername(authentication.getName()));
        diagnosisPage.setRecordDate(new Date());

        diagnosisPageService.save(diagnosisPage);

        return diagnosis(model, id);
    }

    @GetMapping(value = {"/anamnesis", "/anamnesis/{id}"})
    public String anamnesis(Model model, @PathVariable(required = false) String id) {

        model.addAttribute("anamnesisPage", new AnamnesisPage());

        return "medical_card/anamnesis";
    }

    @PostMapping(value = {"/anamnesis", "/anamnesis/{id}"})
    public String saveAnamnesis(Model model, @PathVariable(required = false) String id, @ModelAttribute("anamnesisPage") AnamnesisPage anamnesisPage, BindingResult bindingResult) {

        return "medical_card/anamnesis";
    }

    @GetMapping(value = {"/disability", "/disability/{id}"})
    public String disability(Model model, @PathVariable(required = false) String id) {

        model.addAttribute("disabilityPage", new TemporaryDisabilityPage());//

        List<TemporaryDisabilityPage> temporaryDisabilityPages;

        if (id == null) {
            Authentication authentication = authenticationFacade.getAuthentication();
            temporaryDisabilityPages = temporaryDisabilityPageService.findByPatientUsername(authentication.getName());

        } else {
            temporaryDisabilityPages = temporaryDisabilityPageService.findByPatientId(Long.parseLong(id));
        }

        model.addAttribute("disability", temporaryDisabilityPages);

        return "medical_card/disability";
    }

    @PostMapping(value = {"/disability", "/disability/{id}"})
    public String saveDisability(Model model, @PathVariable(required = false) String id, @ModelAttribute("disabilityPage") TemporaryDisabilityPage temporaryDisabilityPage, BindingResult bindingResult) {

        Authentication authentication = authenticationFacade.getAuthentication();

        temporaryDisabilityPage.setMedicalCard(medicalCardService.findByPatientId(Long.parseLong(id)));
        temporaryDisabilityPage.setMedicalWorker(userService.findUserByUsername(authentication.getName()));
        temporaryDisabilityPage.setRecordDate(new Date());

        temporaryDisabilityPageService.save(temporaryDisabilityPage);

        return disability(model, id);
    }

    @GetMapping(value = {"/gynecological", "/gynecological/{id}"})
    public String gynecological(Model model, @PathVariable(required = false) String id) {

        model.addAttribute("gynecologicalPage", new GynecologicalPage());

        List<GynecologicalPage> gynecologicalPages;

        if (id == null) {
            Authentication authentication = authenticationFacade.getAuthentication();
            gynecologicalPages = gynecologicalPageService.findByPatientUsername(authentication.getName());

        } else {
            gynecologicalPages = gynecologicalPageService.findByPatientId(Long.parseLong(id));
        }

        model.addAttribute("gynecological", gynecologicalPages);

        return "medical_card/gynecological";
    }

    @PostMapping(value = {"/gynecological", "/gynecological/{id}"})
    public String saveGynecological(Model model, @PathVariable(required = false) String id, @ModelAttribute("gynecologicalPage") GynecologicalPage gynecologicalPage, BindingResult bindingResult) {

        Authentication authentication = authenticationFacade.getAuthentication();

        gynecologicalPage.setMedicalCard(medicalCardService.findByPatientId(Long.parseLong(id)));
        gynecologicalPage.setMedicalWorker(userService.findUserByUsername(authentication.getName()));
        gynecologicalPage.setRecordDate(new Date());

        gynecologicalPageService.save(gynecologicalPage);

        return gynecological(model, id);
    }

    @GetMapping(value = {"/xray", "/xray/{id}"})
    public String xray(Model model, @PathVariable(required = false) String id) {

        model.addAttribute("xrayPage", new XRayPage());//

        List<XRayPage> xRayPages;

        if (id == null) {
            Authentication authentication = authenticationFacade.getAuthentication();
            xRayPages = xRayPageService.findByPatientUsername(authentication.getName());

        } else {
            xRayPages = xRayPageService.findByPatientId(Long.parseLong(id));
        }

        model.addAttribute("xray", xRayPages);

        return "medical_card/xray";
    }

    @PostMapping(value = {"/xray", "/xray/{id}"})
    public String saveXray(Model model, @PathVariable(required = false) String id, @ModelAttribute("xrayPage") XRayPage xRayPage, BindingResult bindingResult) {

        Authentication authentication = authenticationFacade.getAuthentication();

        xRayPage.setMedicalCard(medicalCardService.findByPatientId(Long.parseLong(id)));
        xRayPage.setMedicalWorker(userService.findUserByUsername(authentication.getName()));
        xRayPage.setRecordDate(new Date());

        xRayPageService.save(xRayPage);

        return xray(model, id);
    }

    @GetMapping(value = {"/medical_examination", "/medical_examination/{id}"})
    public String medicalExamination(Model model, @PathVariable(required = false) String id) {

        model.addAttribute("medicalExaminationPage", new MedicalExaminationPage());//

        List<MedicalExaminationPage> medicalExaminationPages;

        if (id == null) {
            Authentication authentication = authenticationFacade.getAuthentication();
            medicalExaminationPages = medicalExaminationPageService.findByPatientUsername(authentication.getName());

        } else {
            medicalExaminationPages = medicalExaminationPageService.findByPatientId(Long.parseLong(id));
        }

        model.addAttribute("medicalExamination", medicalExaminationPages);

        return "/medical_card/medical_examination";
    }

    @PostMapping(value = {"/medical_examination", "/medical_examination/{id}"})
    public String saveMedicalExamination(Model model, @PathVariable(required = false) String id, @ModelAttribute("medicalExaminationPage") MedicalExaminationPage medicalExaminationPage, BindingResult bindingResult) {

        Authentication authentication = authenticationFacade.getAuthentication();

        medicalExaminationPage.setMedicalCard(medicalCardService.findByPatientId(Long.parseLong(id)));
        medicalExaminationPage.setTreatmentDoctor(userService.findUserByUsername(authentication.getName()));
        medicalExaminationPage.setReceivingDoctor(userService.findUserByUsername(authentication.getName()));
        medicalExaminationPage.setRecordDate(new Date());

        medicalExaminationPageService.save(medicalExaminationPage);

        return medicalExamination(model, id);
    }

    @GetMapping(value = {"/vaccination", "/vaccination/{id}"})
    public String vaccination(Model model, @PathVariable(required = false) String id) {

        model.addAttribute("vaccinationPage", new VaccinationPage());//

        List<VaccinationPage> vaccinationPages;

        if (id == null) {
            Authentication authentication = authenticationFacade.getAuthentication();
            vaccinationPages = vaccinationPageService.findByPatientUsername(authentication.getName());

        } else {
            vaccinationPages = vaccinationPageService.findByPatientId(Long.parseLong(id));
        }

        model.addAttribute("vaccination", vaccinationPages);

        return "/medical_card/vaccination";
    }

    @PostMapping(value = {"/vaccination", "/vaccination/{id}"})
    public String saveVaccination(Model model, @PathVariable(required = false) String id, @ModelAttribute("vaccinationPage") VaccinationPage vaccinationPage, BindingResult bindingResult) {

        Authentication authentication = authenticationFacade.getAuthentication();

        vaccinationPage.setMedicalCard(medicalCardService.findByPatientId(Long.parseLong(id)));
        vaccinationPage.setMedicalWorker(userService.findUserByUsername(authentication.getName()));
        vaccinationPage.setRecordDate(new Date());

        vaccinationPageService.save(vaccinationPage);

        return vaccination(model, id);
    }

    @GetMapping(value = {"/preventive_examination", "/preventive_examination/{id}"})
    public String preventiveExamination(Model model, @PathVariable(required = false) String id) {

        model.addAttribute("preventiveExaminationPage", new PreventiveExaminationPage());//для постзапроса

        List<PreventiveExaminationPage> preventiveExaminationPages;

        if (id == null) {
            Authentication authentication = authenticationFacade.getAuthentication();
            preventiveExaminationPages = preventiveExaminationPageService.findByPatientUsername(authentication.getName());

        } else {

            preventiveExaminationPages = preventiveExaminationPageService.findByPatientId(Long.parseLong(id));
        }

        model.addAttribute("preventiveExaminationPages", preventiveExaminationPages);

        return "/medical_card/preventive_examination";
    }

    @PostMapping(value = {"/preventive_examination", "/preventive_examination/{id}"})
    public String savePreventiveExamination(Model model, @PathVariable(required = false) String id, @ModelAttribute("preventiveExaminationPage") PreventiveExaminationPage preventiveExaminationPage, BindingResult bindingResult) {
        return "/medical_card/preventive_examination";
    }
}

package com.bntu.nadia.electronic_medical_card.repositories.user;

import com.bntu.nadia.electronic_medical_card.config.PersistenceContextConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = PersistenceContextConfig.class)
public class UserRepositoryTest {

    @Autowired
    UserRepository userRepository;

    @Test
    public void testCreateUserDataRepositoryEntity() {

//        User user = new User();
//        user.setPassword("test2");
//        user.setUserRoleId(UserRole.PATIENT.getId());
//        user.setAuthorityThatIssuedPassport("test2");
//        user.setDateOfIssueOfPassport(new GregorianCalendar(2010, Calendar.JANUARY, 17));
//        user.setUsername("test2");
//        user.setIndividualNumber("test2");
//        user.setName("test2");
//        user.setSurname("test2");
//        user.setPatronymic("test2");
//        user.setPassportId("test2");
//        user.setPassportSeries("test2");
//
//        User saved = userRepository.save(user);
//
//        Assert.assertNotNull(saved);
//        Assert.assertNotNull(saved.getId());
    }
}
package com.bntu.nadia.electronic_medical_card.model.user;

import javax.persistence.*;

@Entity
@Table(name = "health_worker")
public class MedicalWorker {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private UserData userData;

    @Column(name = "health_worker_role_id")
    private MedicalWorkerRole medicalWorkerRole;

    public MedicalWorker () {}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public UserData getUserData() {
        return userData;
    }

    public void setUserData(UserData userData) {
        this.userData = userData;
    }

    public MedicalWorkerRole getMedicalWorkerRole() {
        return medicalWorkerRole;
    }

    public void setMedicalWorkerRole(MedicalWorkerRole medicalWorkerRole) {
        this.medicalWorkerRole = medicalWorkerRole;
    }
}

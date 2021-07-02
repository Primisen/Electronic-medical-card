create database electronic_medical_card;
use electronic_medical_card;

create table user_role (
	id int auto_increment not null,
	role_name varchar(15) not null,
	primary key(id)
);

insert into user_role (role_name) value ("PATIENT");
insert into user_role (role_name) value ("MEDICAL");
insert into user_role (role_name) value ("ADMIN");

create table user(
	id bigint auto_increment not null,
	name varchar(50) not null,
	surname varchar(50) not null,
	patronymic varchar(50) not null,
	login varchar(70) not null,
	encrypted_password varchar(90) not null,
    -- active bit not null,

	primary key (id)
);

create table address(
	id bigint auto_increment not null,
    street varchar(30),
    home_number varchar(30) not null,
    case_number varchar(10),
    flat_number varchar(30),
    locality varchar(30) not null,
    district varchar(30) not null,
    region varchar(30) not null,
    
    primary key (id)
);

create table personal_part(
	id bigint auto_increment not null,
	name varchar(50) not null,
	surname varchar(50) not null,
	patronymic varchar(50) not null,
    gender varchar(10) not null,
    date_of_birth date,
    address_id bigint not null,
    work_place varchar(150) not null,
    position varchar(30),
    disease varchar(30),
    information_about_burdened_allergic_anamnesis varchar(200),
    information_about_transferred_viral_hepatitis varchar(200),
    elderly_and_senile_people_living_alone bit,
    privileged_group varchar(255),
    observing_person varchar(255),
    -- medical_card_id bigint,
	primary key (id),
    foreign key (address_id) references address(id)
    -- foreign key (medical_card_id) references medical_card(id)
);

create table medical_card(
	id bigint auto_increment not null,
    user_id bigint not null,
    personal_part_id bigint,
    
    primary key(id),
    foreign key (user_id) references user (id),
    foreign key (personal_part_id) references personal_part (id)
);

create table phone (
	id bigint auto_increment not null,
    phone_number varchar(17) not null,
    personal_part_id bigint not null,

	primary key (id),
    foreign key (personal_part_id) references personal_part(id)
);

create table dispensary_observation_group (
	id bigint auto_increment not null,
    personal_part_id bigint not null,
	group_name varchar(7) not null,

	primary key (id),
    foreign key (personal_part_id) references personal_part(id) 
);

create table diagnosis_part(
	id bigint auto_increment not null,
	record_date date not null,
	diagnosis_name varchar(70) not null,
	newly_diagnosed bit,
	health_worker_id bigint not null,
    medical_card_id bigint not null,

	primary key (id),
	foreign key (health_worker_id) references user (id),
    foreign key (medical_card_id) references medical_card(id)
);

create table gynecological_examination_part(
	id bigint auto_increment not null,
	record_date date not null,
    health_worker_id bigint not null,
    diagnosis varchar(90),
    cytology varchar(90),
    medical_card_id bigint not null,

	primary key (id),
    foreign key (health_worker_id) references user (id),
    foreign key (medical_card_id) references medical_card(id)
);

create table accounting_temporary_disability_part(
	id bigint auto_increment not null,
    record_date date not null,
	begin_date date not null,
    health_worker_id bigint not null,
    diagnosis varchar(200) not null,
    end_date date not null,
    day_number int not null,
    medical_card_id bigint not null,

	primary key (id),
    foreign key (health_worker_id) references user (id),
    foreign key (medical_card_id) references medical_card(id)
);

create table xray_examination_part(
	id bigint auto_increment not null,
	record_date date not null,
	health_worker_id bigint not null,
    type_of_research varchar(200) not null,
    dose varchar(200) not null,
    medical_card_id bigint not null,

	primary key (id),
	foreign key (health_worker_id) references user (id),
    foreign key (medical_card_id) references medical_card(id)
);

create table anamnesis_part(
	id bigint auto_increment not null,
	record_date date not null,
	health_worker_id bigint not null,
    past_illnesses varchar(255),
    operations varchar(255),
    heredity varchar(255),
	drug_allergy varchar(255),
    harmful_and_hazardous_working_conditions varchar(255),
    brief_information_about_the_main_disease varchar(255),
    other_information varchar(255),
    date_of_registration_on_d date,
    addition_to_anamnesis varchar(255),
    medical_card_id bigint not null,

	primary key (id),
	foreign key (health_worker_id) references user (id),
    foreign key (medical_card_id) references medical_card(id)
);

create table risk_factors (
	id int auto_increment not null,
    anamnesis_part_id bigint not null,
    risk_factors_group varchar(100) not null,
    
    primary key(id),
    foreign key (anamnesis_part_id) references anamnesis_part(id)
);

create table recording_medical_examination_part(
	id bigint auto_increment not null,
	record_date date not null,
	receiving_doctor_id bigint,
	treatment_doctor_id bigint,
	complaints varchar(255),
	objectively varchar(255),
	diagnosis varchar(255),
	survey_plan varchar(255),
	treatment varchar(255),
	pulse varchar(50),
	heart_rate varchar(50),
	bh varchar(50),
	ad varchar(50),
    medical_card_id bigint not null,

	primary key (id),
	foreign key (receiving_doctor_id) references user(id),
	foreign key (treatment_doctor_id) references user(id),
    foreign key (medical_card_id) references medical_card(id)
);

create table preventive_examination_question(
	id int auto_increment not null,
	question varchar(255) not null,

	primary key (id)
);

insert into preventive_examination_question (question) value ("Изменились ли за последние месяцы цвет и размеры пигментных (родимых)пятен?");
insert into preventive_examination_question (question) value ("Есть ли на коже, губах, слизистой полости рта и языка язвы, трещины, разрастания, уплотнение и шелушение?");
insert into preventive_examination_question (question) value ("Имеются ли затруднения при проглатывании жидкой или твердой пищи?");
insert into preventive_examination_question (question) value ("Отмечаете ли в настоящее время общую слабость, ухудшение аппетита, нарастающее похудение, постоянные отрыжки и рвоты, чувство тяжести и боли в поджелудочной области, запоры, поносы?");
insert into preventive_examination_question (question) value ("Отмечается ли примесь крови в моче, кале или дегтеобразный стул?");
insert into preventive_examination_question (question) value ("Есть ли в настоящее время кашель, кровохаркание, боли в грудной клетке, осиплость голоса?");
insert into preventive_examination_question (question) value ("Имеются ли уплотнения в молочных (грудных) железах, язвы, трещины в области соска, кровянистые выделения из соска?");
insert into preventive_examination_question (question) value ("Имеются ли кровянистые выделения из влагалища, не связанные с месячными?");
insert into preventive_examination_question (question) value ("Другие жалобы.");

create table questionnaire(
	id bigint auto_increment not null,
    question_id int not null,
    answer bit not null,
    other varchar(100),

    primary key(id),
    foreign key (question_id) references preventive_examination_question(id)
);

create table preventive_examination_part(
	id bigint auto_increment not null,
    record_date date not null,
    health_worker_id bigint not null,
    leather varchar(255),
	lip varchar(255),
	tongue_and_oral_mucosa varchar(255),
	esophagus varchar(255),
	stomach varchar(255),
	rectum varchar(255),	
	lungs varchar(255),
	breast varchar(255),
	uterus varchar(255),
	other varchar(255),
    questionnaire_id bigint,
    medical_card_id bigint not null,

	primary key (id),
    foreign key (health_worker_id) references user (id),
    foreign key (questionnaire_id) references questionnaire (id),
    foreign key (medical_card_id) references medical_card(id)
);

create table vaccination_part (
	id bigint auto_increment not null,
    record_date date not null,
    health_worker_id bigint not null,
    vaccination_name varchar(30),
    dose varchar(30) not null,
    name_of_drug varchar(30) not null,
    series varchar(30) not null,
    local_reaction varchar(30),
    general_reaction varchar(30),
    medical_card_id bigint not null,
	
	primary key (id),
    foreign key (health_worker_id) references user (id),
    foreign key (medical_card_id) references medical_card(id)
);

package com.bntu.nadia.electronic_medical_card.config;

//@Configuration
//@EnableJpaRepositories(basePackages = { "com.bntu.nadia.electronic_medical_card.repositories" })
//@PropertySource("classpath:persistence.properties")
public class JpaConfig {

//    //Data Source props
//    private String dbDriver;
//    private String dbPassword;
//    private String dbUrl;
//    private String dbUsername;
//
//    //Hibernate props
//    private String hibernateDialect;
//    private String hibernateFormatSql;
//    private String hibernateShowSql;
//    private String entitiesIntoPackagesToScan;
//    private String hibernateHbm2ddlAuto;
//
//    @Resource
//    private Environment environment;
//
//    @PostConstruct
//    private void initialzing() {
//        dbDriver = environment.getProperty("db.driver");
//        dbPassword = environment.getProperty("db.password");
//        dbUrl = environment.getProperty("db.url");
//        dbUsername = environment.getProperty("db.username");
//        hibernateDialect = environment.getProperty("hibernate.dialect");
//        hibernateFormatSql = environment.getProperty("hibernate.format_sql");
//        hibernateShowSql = environment.getProperty("hibernate.show_sql");
//        entitiesIntoPackagesToScan = environment.getProperty("entities.into.packages.to.scan");
//        hibernateHbm2ddlAuto = environment.getProperty("hibernate.hbm2ddl.auto");
//    }
//
//    @Bean
//    public DataSource dataSource() {
//        BasicDataSource dataSource = new BasicDataSource();
//        dataSource.setDriverClassName(this.dbDriver);
//        dataSource.setUrl(this.dbUrl);
//        dataSource.setUsername(this.dbUsername);
//        dataSource.setPassword(this.dbPassword);
//        return dataSource;
//    }
//
//    @Bean
//    public JpaTransactionManager transactionManager()
//            throws ClassNotFoundException {
//        JpaTransactionManager transactionManager = new JpaTransactionManager();
//        transactionManager.setEntityManagerFactory(entityManagerFactory()
//                .getObject());
//        return transactionManager;
//    }
//
//    @Bean
//    public LocalContainerEntityManagerFactoryBean entityManagerFactory()
//            throws ClassNotFoundException {
//        LocalContainerEntityManagerFactoryBean entityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();
//        entityManagerFactoryBean.setDataSource(dataSource());
//        entityManagerFactoryBean.setPackagesToScan(this.entitiesIntoPackagesToScan);
//        entityManagerFactoryBean.setPersistenceProviderClass(HibernatePersistenceProvider.class);
//
//        Properties jpaProterties = new Properties();
//        jpaProterties.put("hibernate.dialect",this.hibernateDialect);
//        jpaProterties.put("hibernate.format_sql", this.hibernateFormatSql);
//        jpaProterties.put("hibernate.show_sql", this.hibernateShowSql);
//        jpaProterties.put("hibernate.hbm2ddl.auto", this.hibernateHbm2ddlAuto);
//        entityManagerFactoryBean.setJpaProperties(jpaProterties);
//        return entityManagerFactoryBean;
//    }
}

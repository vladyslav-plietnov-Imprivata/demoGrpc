package com.pl.demo.config;

import org.flywaydb.core.Flyway;
import org.postgresql.ds.PGSimpleDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class AppConfig {

  private final DBProperty dbProperty;

  public AppConfig(DBProperty dbProperty) {
    this.dbProperty = dbProperty;
  }

  @Bean
  public DataSource dataSource() {
    PGSimpleDataSource ds = new PGSimpleDataSource();
    ds.setServerNames(new String[] {dbProperty.getServer()});
    ds.setPortNumbers(new int[] {dbProperty.getPort()});
    ds.setDatabaseName(dbProperty.getDb());
    ds.setUser(dbProperty.getUsername());
    ds.setPassword(dbProperty.getPassword());
    return ds;
  }

  @Bean
  public Flyway migrate(DataSource dataSource) {
    Flyway flyway =
        Flyway.configure()
            .locations("classpath:/db/migration")
            .table("flyway_history")
            .schemas(dbProperty.getSchema())
            .dataSource(dataSource)
            .load();

    flyway.migrate();

    return flyway;
  }
}

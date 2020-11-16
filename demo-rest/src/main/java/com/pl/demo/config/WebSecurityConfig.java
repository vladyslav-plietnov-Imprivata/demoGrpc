package com.pl.demo.config;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.sql.DataSource;

@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

  private final DataSource dataSource;
  private final PasswordEncoder passwordEncoder;

  public WebSecurityConfig(DataSource dataSource, PasswordEncoder passwordEncoder) {
    this.dataSource = dataSource;
    this.passwordEncoder = passwordEncoder;
  }

  @Override
  protected void configure(AuthenticationManagerBuilder auth) throws Exception {
    auth.jdbcAuthentication()
        .dataSource(dataSource)
        .passwordEncoder(passwordEncoder)
        .usersByUsernameQuery("SELECT username, password, enabled from users where username = ?")
        .authoritiesByUsernameQuery(
            "SELECT u.username, a.authority " +
            "FROM user_authorities a, users u " +
            "WHERE u.username = ? " +
            "AND u.id = a.user_id"
        );
  }

  @Override
  protected void configure(HttpSecurity http) throws Exception {
    http.csrf().disable();
  }
}

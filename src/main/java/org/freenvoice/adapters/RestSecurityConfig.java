package org.freenvoice.adapters;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;



/*
 * 
 * 
 * Questa classe disabilita il Cross-Site Request Forgery che in SpringSecurity è attivata di default !
 * 
 */

@Configuration
public class RestSecurityConfig extends WebSecurityConfigurerAdapter {
  @Override
  protected void configure(HttpSecurity http) throws Exception {
    http.csrf().disable();
  }
}
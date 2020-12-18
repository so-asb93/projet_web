package com.example.urbinoennasri;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
public class Security extends WebSecurityConfigurerAdapter {

    @Override
    public void configure(HttpSecurity http) throws Exception {
http
                .authorizeRequests()
                .antMatchers("/", "/accueil_sondage2").permitAll()
                .antMatchers("/authentification2").permitAll()
                .antMatchers("/accueil_sondage2").permitAll()
                .antMatchers("/inscription2").permitAll()
                .antMatchers("/creation_sondage2").permitAll()

                .anyRequest().authenticated()
                .and()
// form login
                .csrf().disable().formLogin()
                .loginPage("/authentification2")
                .permitAll()
                .failureUrl("/accueil_sondage2")
                .defaultSuccessUrl("/accueil_sondage2")
                .usernameParameter("mail")
                .passwordParameter("password")
                .and()
// logout
                .logout()
                .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
                .logoutSuccessUrl("/").and()
                .exceptionHandling()
                .accessDeniedPage("/access-denied");
    }

}
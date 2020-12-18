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
                .antMatchers("/").permitAll()
                .antMatchers("/authentification").permitAll()
                .antMatchers("/accueil_sondage").permitAll()
                .antMatchers("/inscription").permitAll()
                 //.antMatchers("/register").permitAll()
//                .antMatchers("/accueil_sondage/**").hasAnyAuthority("SUPER_USER", "ADMIN_USER", "SITE_USER")
//                .anyRequest().authenticated()
                .and()
// form login
                .csrf().disable().formLogin()
                .loginPage("/authentification")
                //.failureUrl("/errorfile?error=true")
                .defaultSuccessUrl("/accueil_sondage")
                .usernameParameter("u")
                .passwordParameter("p")
                .and()
// logout
                .logout()
                .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
                .logoutSuccessUrl("/").and()
                .exceptionHandling()
                .accessDeniedPage("/access-denied");
    }
}
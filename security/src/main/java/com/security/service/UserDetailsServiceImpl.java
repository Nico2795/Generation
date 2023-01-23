package com.security.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.security.core.userdetails.User;

import com.security.model.Authority;
import com.security.repository.UserRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    
    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //Buscar en usuario con el repository y su no existe vamos a lanzar una excepccion
        //Nosotros generamos la excepcion
        //Guardamos en una variable el usuario buscado segun username, si no lo encuentra creamos un error el cual al momento de generarse. nos devolvera el mensaje no existe el usuario
        
        com.security.model.User appUser = 
        userRepository.findByUsername(username).orElseThrow(()-> new UsernameNotFoundException(("No existe el usuario")));

        //vamos a mappear nuestra lista de Authority con las propiedades de spring security

        List gantList = new ArrayList<>();
        for(Authority authority: appUser.getAuthority()){
            //ROL_USER, REL_ADMIN, ROL_CLIENT
            GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(authority.getAuthority());
            gantList.add(grantedAuthority);
        }

        //Vamos a crear el obketo UserDetails que va a ir sesion y también son lo va a retornar

        UserDetails user = (UserDetails) new User(appUser.getUsername(), appUser.getPassword(), gantList);
        return user;

    }
}

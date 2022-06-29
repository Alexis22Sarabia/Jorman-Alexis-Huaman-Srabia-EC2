package com.idat.EC1JormanHuaman.security;

import java.util.ArrayList;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailService implements UserDetailsService {

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		if("alumno".equals(username)) {
			
			return new User("alumno", "123", new ArrayList<>());
		}else 
			throw new UsernameNotFoundException("usuario no existe" + username);
		
	}

}

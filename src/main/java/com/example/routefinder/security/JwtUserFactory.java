package com.example.routefinder.security;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import com.example.routefinder.user.User;



public class JwtUserFactory {
	
	public static JwtUser create(User user) {
			
	
		return new JwtUser(user.getId(), user.getEmail(), user.getPassword(), user,  maptoGrantedAuthorities(new ArrayList<String>(Arrays.asList("ROLE_" ))), true);
	}

	private static List<GrantedAuthority> maptoGrantedAuthorities(List<String> authorities) {
		
		return authorities.stream().map(Authority -> new SimpleGrantedAuthority(Authority)).collect(Collectors.toList());
	}

}

package cl.java.web.WaterBnB.services;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import cl.java.web.WaterBnB.models.User;
import cl.java.web.WaterBnB.repositories.UserRepository;


@Service
public class UserDetailsServiceImplementation implements UserDetailsService{

	private UserRepository userRepository;
	
	public UserDetailsServiceImplementation(UserRepository userRepository)
	{
		this.userRepository = userRepository;
	}
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepository.findByEmail(username);
		return null;
	}

}
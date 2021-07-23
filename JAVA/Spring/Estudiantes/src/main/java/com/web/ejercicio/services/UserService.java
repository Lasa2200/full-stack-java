package com.web.ejercicio.services;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.ejercicio.models.User;
import com.web.ejercicio.repositories.UserRepository;
@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	// registrar el usuario y hacer Hash a su password
    public User registerUser(User user) {
        String hashed = BCrypt.hashpw(user.getPassword(), BCrypt.gensalt());
        user.setPassword(hashed);
        return userRepository.save(user);
    }
    
    // encontrar un usuario por su email
    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }
    
    // encontrar un usuario por su id
    public User findUserById(Long id) {
    	return userRepository.findById(id).orElse(null);
    }
    
    // autenticar usuario
    public boolean authenticateUser(String email, String password) {
        // primero encontrar el usuario por su email
        User user = userRepository.findByEmail(email);
        // si no lo podemos encontrar por su email, retornamos false
        if(user == null) {
            return false;
        } else {
            // si el password coincide devolvemos true, sino, devolvemos false
            if(BCrypt.checkpw(password, user.getPassword())) {
                return true;
            } else {
                return false;
            }
        }
    }
}

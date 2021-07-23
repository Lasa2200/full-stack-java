package com.talento.java.web.services;


import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.talento.java.web.models.User;
import com.talento.java.web.repositories.UserRepository;

;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	
    public User registerUser(User user) {
        String hashed = BCrypt.hashpw(user.getPassword(), BCrypt.gensalt());
        user.setPassword(hashed);
        return userRepository.save(user);
    }
    
  
    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }
    
  
    public User findUserById(Long id) {
    	return userRepository.findById(id).orElse(null);
    }
    
   
    public boolean authenticateUser(String email, String password) {
       
        User user = userRepository.findByEmail(email);
      
        if(user == null) {
            return false;
        } else {
           
            if(BCrypt.checkpw(password, user.getPassword())) {
                return true;
            } else {
                return false;
            }
        }
    }
}

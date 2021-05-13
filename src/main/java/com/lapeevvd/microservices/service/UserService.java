package com.lapeevvd.microservices.service;

import com.lapeevvd.microservices.exception.ApplicationException;
import com.lapeevvd.microservices.model.User;
import com.lapeevvd.microservices.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public User getUser(Long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new ApplicationException("User with id " + id + " is not exist"));
    }

    @Transactional
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Transactional
    public void editUser(Long id, User editedUser) {
        userRepository.findById(id)
                .orElseThrow(() -> new ApplicationException("User with id " + id + " is not exist"));
        editedUser.setId(id);
        userRepository.save(editedUser);
    }

    @Transactional
    public void deleteUser(Long id) {
        User user = getUser(id);
        userRepository.delete(user);
    }
}

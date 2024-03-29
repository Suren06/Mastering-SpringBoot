package com.spring.serviceImpl;

import com.spring.model.User;
import com.spring.repository.UserRepository;
import com.spring.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public void createUser(User user) {
        userRepository.save(user);

    }
}

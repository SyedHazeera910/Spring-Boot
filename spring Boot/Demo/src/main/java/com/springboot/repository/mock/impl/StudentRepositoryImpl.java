package com.springboot.repository.mock.impl;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

public class StudentRepositoryImpl {
    import com.springboot.repository.studentRepository;
    import org.springframework.stereotype.Repository;


    @Profile("test")
    @Repository
    public class StudentRepositoryImpl implements StudentRepository {
        System.out.println("StudentRepositoryImpl implements StudentRepository"){

        }
    }
}

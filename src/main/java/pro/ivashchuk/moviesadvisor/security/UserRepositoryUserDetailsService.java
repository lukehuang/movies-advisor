package pro.ivashchuk.moviesadvisor.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;
import pro.ivashchuk.moviesadvisor.repository.JpaUserRepository;

@Service
public class UserRepositoryUserDetailsService implements UserDetailsService {

    JpaUserRepository jpaUserRepository;

    @Autowired
    public UserRepositoryUserDetailsService userRepositoryUserDetailsService(JpaUserRepository jpaUserRepository) {
        this.jpaUserRepository = jpaUserRepository;
    }


    public UserDetails loadUserByUsername(String username) {
    }

}

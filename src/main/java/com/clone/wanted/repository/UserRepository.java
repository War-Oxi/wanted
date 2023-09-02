package com.clone.wanted.repository;

import com.clone.wanted.User.Authority;
import com.clone.wanted.User.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.nio.channels.FileChannel;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {

	Optional<User> findOneWithAuthoritiesByUsername(String s);
	Optional<User> findOneWithAuthoritiesByEmail(String s);

	Optional<User> findByEmail(String email);
}

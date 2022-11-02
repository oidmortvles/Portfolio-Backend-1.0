package com.backend.backendportfolio.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.backend.backendportfolio.entity.Role;
import com.backend.backendportfolio.entity.ERole;


public interface RoleRepository extends JpaRepository<Role, Long>{
	Optional<Role> findByName(ERole name);

}

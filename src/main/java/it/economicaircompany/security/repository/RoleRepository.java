package it.economicaircompany.security.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import it.economicaircompany.security.model.Role;
import it.economicaircompany.security.model.Roles;

public interface RoleRepository extends JpaRepository<Role, Integer> {

	Optional<Role> findByRoleName(Roles role);
}

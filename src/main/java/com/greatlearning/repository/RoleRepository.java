package com.greatlearning.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.entity.Roles;

public interface RoleRepository extends JpaRepository<Roles, Integer> {

}

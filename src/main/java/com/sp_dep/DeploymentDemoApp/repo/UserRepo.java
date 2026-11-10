package com.sp_dep.DeploymentDemoApp.repo;

import com.sp_dep.DeploymentDemoApp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {

    boolean existsByEmail(String email);
}

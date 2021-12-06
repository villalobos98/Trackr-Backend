package com.server.trackr.Trackr.Repository;

import com.server.trackr.Trackr.Entities.Credential;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserCredentialRepository extends JpaRepository<Credential, Integer> {
}

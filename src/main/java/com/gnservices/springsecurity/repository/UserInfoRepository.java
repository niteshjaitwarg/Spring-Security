package com.gnservices.springsecurity.repository;

import com.gnservices.springsecurity.domain.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserInfoRepository extends JpaRepository<UserInfo,Integer> {
    Optional<UserInfo> findByName(String userName);
}

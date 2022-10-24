package com.containstudy.demo.repository;

import com.containstudy.demo.entity.Member;
import org.springframework.data.repository.CrudRepository;

/**
 * Member 테이블 : 리포지토리
 */
public interface MemberCrudRepository extends CrudRepository<Member, Integer> {
}

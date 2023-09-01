package com.springbootassignment.practice.gymmanagementassignment.service;

import com.springbootassignment.practice.gymmanagementassignment.model.Member;

import java.util.List;

public interface MemberService {
    Member addMember(Member member);
    List<Member> getAllMembers();
    // Other service methods
    Member getMemberById(Long memberId);
}
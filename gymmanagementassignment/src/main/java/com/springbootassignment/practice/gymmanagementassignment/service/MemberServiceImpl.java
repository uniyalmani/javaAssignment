package com.springbootassignment.practice.gymmanagementassignment.service;

import com.springbootassignment.practice.gymmanagementassignment.model.Member;

import java.util.ArrayList;
import java.util.List;

public class MemberServiceImpl implements MemberService {
    private List<Member> members = new ArrayList<>();


    public Member addMember(Member member) {
        members.add(member);
        return member;
    }


    public List<Member> getAllMembers() {
        return members;
    }


    public Member getMemberById(Long memberId) {
        return members.stream()
                .filter(member -> member.getMemberId().equals(memberId))
                .findFirst()
                .orElse(null);
    }

}

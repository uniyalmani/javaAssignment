package com.springbootassignment.practice.gymmanagementassignment.controller;


import com.springbootassignment.practice.gymmanagementassignment.model.Member;
import com.springbootassignment.practice.gymmanagementassignment.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/member")
public class MemberController {

    private final MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @PostMapping("")
    public Member addMember(@RequestBody Member member) {
        return memberService.addMember(member);
    }

    @GetMapping("")
    public List<Member> getAllMembers() {
        return memberService.getAllMembers();
    }

    @GetMapping("/{memberId}")
    public ResponseEntity<Member> getMemberById(@PathVariable Long memberId) {
        Member member = memberService.getMemberById(memberId);
        if (member != null) {
            return ResponseEntity.ok(member);
        } else {
            return ResponseEntity.notFound().build();
        }
    }


}

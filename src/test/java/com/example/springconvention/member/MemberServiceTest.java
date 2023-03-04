package com.example.springconvention.member;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MemberServiceTest {

    MemberService memberService = new MemberServiceImpl();

    @Test
    void join() {
        Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.join(member);
        Member result = memberService.findMember(1L);
        assertThat(result).isEqualTo(member);
    }

    @Test
    void findMember() {
    }
}
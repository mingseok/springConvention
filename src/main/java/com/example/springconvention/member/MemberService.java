package com.example.springconvention.member;

public interface MemberService {

    void join(Member member);

    Member findMember(Long memberId);
}

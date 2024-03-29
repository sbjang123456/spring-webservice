package com.songjang.webservice.member.controller;

import com.songjang.webservice.member.dto.MemberRequestDto;
import com.songjang.webservice.member.dto.MemberResponseDto;
import com.songjang.webservice.member.service.MemberService;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class MemberController {

    private MemberService memberService;

    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @PostMapping("/member")
    public Long saveMember(@RequestBody @Valid MemberRequestDto memberRequestDto) {
        return memberService.save(memberRequestDto);
    }

    @GetMapping("/members")
    public MemberRequestDto findAll(@ModelAttribute @Valid MemberRequestDto memberRequestDto){
        return memberRequestDto;
    }
}

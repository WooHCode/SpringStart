package com.containstudy.demo.chapter05.controller;

import com.containstudy.demo.entity.Member;
import com.containstudy.demo.entity.Member1;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class ThymeleafController {
    @GetMapping("show")
    public String showView(Model model) {
        //Member를 생성
        Member1 member1 = new Member1(1, "회원01");

        // 컬렉션 저장용 Member 생성
        Member member2 = new Member(10, "홍홍길동");
        Member member3 = new Member(20, "이영희");

        //List 생성
        List<String> directionList = new ArrayList<String>();
        directionList.add("동");
        directionList.add("서");
        directionList.add("남");
        directionList.add("북");

        // Map을 생성해서 Member를 저장
        Map<String, Member> memberMap = new HashMap<>();
        memberMap.put("hong", member2);
        memberMap.put("lee", member3);

        // List를 생성해서 Member를 저장
        List<Member> memberList = new ArrayList<>();
        memberList.add(member2);
        memberList.add(member3);

        //Model에 데이터 추가
        model.addAttribute("name", "홍길동");
        model.addAttribute("mb", member1);
        model.addAttribute("list", directionList);
        model.addAttribute("map", memberMap);
        model.addAttribute("members", memberList);

        //반환된 값으로 뷰 이름을 설정
        return "useThymeleaf";
    }
    @GetMapping("/a")
    public String showA(){
        return "pageA";
    }
}

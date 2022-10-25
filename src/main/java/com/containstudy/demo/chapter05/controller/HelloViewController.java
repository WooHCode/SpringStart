package com.containstudy.demo.chapter05.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
/**
 * 인스턴스 생성 어노테이션
 * 클라이언트와 데이터 입출력을 제어하는 애플리케이션 레이어의 컨트롤러를 부여함
 * 요청 핸들러 메서드의 반환값을 뷰 이름으로 하여 템플릿 엔진의 뷰가 응답 HTML을 생성함
 */
@RequestMapping("hello")
/**
 * 해당 어노테이션을 클래스나 메서드에 부여하여 컨트롤러의 요청 핸들러 메서드와 URL매핑을 함
 * 속성으로는 value, method를 사용할 수 있음
 * ex) @RequestMapping(value="hello") , @RequestMapping("hello), @RequestMapping(value={"hello", "hellospring"})
 * ex) @RequestMapping(value = "hello", method = RequestMethod.GET)
 *     @RequestMapping(value ="hello", method ={RequestMethod.GET, RequestMethod.POST})
 */
public class HelloViewController {

    @GetMapping("view")
    /**
     * @RequestMapping의 GET요청용 어노테이션
     * method 속성은 없음
     */
    public String helloView(){
        //반환값으로 뷰의 이름을 돌려줌
    return "hello";
    }

    /**
     * URL매핑으로 인해 클라이언트가  http://localhost:8080/hello/view로 GET 메서드를 보내면
     * HelloViewController 클래스의 helloView메서드가 호출되어 "hello"를 반환
     */
}

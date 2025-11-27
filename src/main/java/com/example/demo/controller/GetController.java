package com.example.demo.controller;
import com.example.demo.dto.MemberDTO;
import org.springframework.web.bind.annotation.*;
import java.util.Map;



@RestController
@RequestMapping("/api/v1/get-api")
public class GetController {
    // 단순 GET 요청 예제
    // http://localhost:8080/api/v1/get-api/hello
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String getHello() {
        return "Hello Around Hub Studio!";
    }
    // @GetMapping 사용한 기본 GET 요청
    // http://localhost:8080/api/v1/get-api/name
    @GetMapping(value = "/name")
    public String getName() {
        return "Flature";
    }
    // PathVariable 사용 — URL 경로의 값을 직접 읽어옴
    // http://localhost:8080/api/v1/get-api/variable1/{String 값}
    @GetMapping(value = "/variable1/{variable}")
    public String getVariable1(@PathVariable String variable) {
        return variable;
    }
    // PathVariable에 별칭 부여
    // URL: /variable2/ABC → var = "ABC"
    // http://localhost:8080/api/v1/get-api/variable2/{String 값}
    @GetMapping(value = "/variable2/{variable}")
    public String getVariable2(@PathVariable("variable") String var) {
        return var;
    }
    // 개별 RequestParam — 파라미터를 하나씩 직접 받는 방식
    // http://localhost:8080/api/v1/get-api/request1?name=flature&email=thinkground.flature@gmail.com&organization=thinkground
    @GetMapping(value = "/request1")
    public String getRequestParam1(
            @RequestParam String name, @RequestParam String email, @RequestParam String organization) {
        return name + " " + email + " " + organization;
    }
    // Map으로 RequestParam 받기 — key/value가 많은 경우 유용
    // http://localhost:8080/api/v1/get-api/request2?key1=value1&key2=value2
    @GetMapping(value = "/request2")
    public String getRequestParam2(@RequestParam Map<String, String> param) {
        StringBuilder sb = new StringBuilder();

        param
                .entrySet()
                .forEach(
                        map -> {
                            sb.append(map.getKey() + " : " + map.getValue() + "\n");
                        });

    /*
    param.forEach((key, value) -> sb.append(key).append(" : ").append(value).append("\n"));
     */

        return sb.toString();
    }
    // DTO로 RequestParam 받기 — 파라미터가 DTO 필드명과 자동 매칭됨
    // http://localhost:8080/api/v1/get-api/request3?name=flature&email=thinkground.flature@gmail.com&organization=thinkground
    @GetMapping(value = "/request3")
    public String getRequestParam3(MemberDTO memberDTO) {
        // return memberDTO.getName() + " " + memberDTO.getEmail() + " " + memberDTO.getOrganization();
        return memberDTO.toString();
    }
}
package studio.thinkground.aroundhub.controller;

import org.springframework.web.bind.annotation.*;
import studio.thinkground.aroundhub.data.dto.MemberDTO;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/get-api")
public class GetController {

    // http://localhost:8080/api/v1/get-api/hello
    @RequestMapping(value="/hello", method= RequestMethod.GET)
    public String getHello(){
        return "Hello World";
    }

    // http://localhost:8080/api/v1/get-api/name
    @GetMapping("/name")
    public String getName(){
        return "Nanaeu";
    }

    // http://localhost:8080/api/v1/get-api/variable1/{String 값}
    @GetMapping(value="/variable1/{variable}")
    public String getVariable1(@PathVariable String variable){
        return variable;
    }

    // String 타입의 인수명이 {vairable}과 다를 경우
    // http://localhost:8080/api/v1/get-api/variable2/{String 값}
    @GetMapping(value="/variable2/{variable}")
    public String getVariable2(@PathVariable("variable") String var) {
        return var;
    }

    // http://localhost:8080/api/v1/get-api/request1?name=flature&email=thinkground.flature@gmail.com&organization=thinkground
    @GetMapping(value="/request1")
    public String getRequestParam1(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam String organization
    ) {
        return name + " " + email + " " + organization;
    }

    // 어떤 값이 요청으로 들어올지 모르는 경우
    // http://localhost:8080/api/v1/get-api/request2?key1=value1&key2=value2
    @GetMapping(value="/request2")
    public String getRequestParam2(@RequestParam Map<String, String> param) {
        StringBuilder sb = new StringBuilder();

        param.entrySet().forEach(map -> {
            sb.append(map.getKey() + " : " + map.getValue() + "\n");
        });

        /*
        param.forEach((key, value) -> sb.append(key).append(" : ").append(value).append("\n"));
        */

        return sb.toString();
    }

    // http://localhost:8080/api/v1/get-api/request3?name=flature&email=thinkground.flature@gmail.com&organization=thinkground
    @GetMapping("/request3")
    public String getRequestParam3(MemberDTO memberDTO) {
        // return memberDTO.getName() + " " + memberDTO.getEmail() + " " + memberDTO.getOrganization();
        return memberDTO.toString();
    }
}

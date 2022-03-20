package studio.thinkground.aroundhub.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/*
* 1. @PathVariable: GET 형식의 요청에서 파라미터를 전달하기 위해 URL에 값을 담아 요청하는 방법
*   ex. @GetMapping(value="/variable/{variable}")
*       public String getVariable(@PathVariable String variable) {
*           return variable;
*       }
*        -> http://localhost:8080/api/v1/get-api/variable/{String 값}
*
* 2. @RequestParam : GET 형식의 요청에서 쿼리 문자열을 전달하기 위해 사용되는 방법
*                   '?'를 기준으로 우측에 {키}={값}의 형태로 전달되며, 복수 형태로 전달할 경우 &를 사용
*   -> 어떤 요청 값이 들어올지 모를 경우 @RequestParam Map<String, String> param 형식으로 받음.
*
* 3. DTO: key와 value가 정해져 있지만, 받아야할 파라미터가 많을 경우 DTO 객체를 사용한 방식
* */

@RestController
public class HelloController {

    // @RequestMapping : value와 method로 정의하여 API를 개발하는 방식. 이제는 고전적인 방법이라 사용X
    // @RequestMapping(value = "/hello", method= RequestMethod.GET)
    
    // @GetMapping: 별도의 파라미터 없이 GET API 호출하는 경우 사용
    @GetMapping("/hello")
    public String hello(){
        return "Hello World!";
    }
}

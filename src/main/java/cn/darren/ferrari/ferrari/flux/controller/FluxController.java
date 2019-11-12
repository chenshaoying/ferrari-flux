package cn.darren.ferrari.ferrari.flux.controller;

import cn.darren.ferrari.ferrari.flux.controller.domain.dto.UserDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Arrays;
import java.util.List;

/**
 * @author chensy
 * @date 2019/11/12 15:25
 */
@RestController
public class FluxController {

    @GetMapping("/flux/hello")
    public Mono<UserDto> hello() {
        UserDto userDto = new UserDto();
        userDto.setAge(1);
        userDto.setName("a");
        return Mono.just(userDto);
    }

    @GetMapping("/flux/multi-hello")
    public Flux<UserDto> multiHello() {
        UserDto a = new UserDto();
        a.setAge(1);
        a.setName("a");

        UserDto b = new UserDto();
        b.setAge(2);
        b.setName("b");
        List<UserDto> list = Arrays.asList(a,b);
        return Flux.fromIterable(list);
    }
}

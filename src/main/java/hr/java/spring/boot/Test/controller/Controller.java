package hr.java.spring.boot.Test.controller;

import hr.java.spring.boot.Test.dto.HardwareDto;
import hr.java.spring.boot.Test.servis.HardwareServis;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/hardware")
@RestController
@AllArgsConstructor
public class Controller {

    private HardwareServis hardwareServis;

    @GetMapping
    public List<HardwareDto> getAllHardware () {
        return hardwareServis.getAllHardware();

    }

}

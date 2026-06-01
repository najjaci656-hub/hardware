package hr.java.spring.boot.Test.Serviss.impl;

import hr.java.spring.boot.Test.HardwareDto.HardwareDto;
import hr.java.spring.boot.Test.Repositoryy.HardwareRepository;
import hr.java.spring.boot.Test.Serviss.HardwareServis;
import hr.java.spring.boot.Test.domain.Hardware;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class HardwareServisImpl implements HardwareServis {

    private HardwareRepository hardwareRepository;

    @Override
    public List<HardwareDto> getAllHardware() {
        List<Hardware> hardwares = hardwareRepository.getAllHardware();
        return toDto(hardwares);
    }

    private List<HardwareDto> toDto(List<Hardware> hardwares) {
        return List.of();
    }
    }




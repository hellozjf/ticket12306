package com.hellozjf.ticket12306.service.impl;

import com.hellozjf.ticket12306.service.StationNameService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @author hellozjf
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class StationNameServiceImplTest {

    @Autowired
    private StationNameService stationNameService;

    @Test
    public void getStationCode() {
        stationNameService.getStationCode("");
    }
}
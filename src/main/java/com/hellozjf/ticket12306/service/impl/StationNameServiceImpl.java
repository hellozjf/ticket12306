package com.hellozjf.ticket12306.service.impl;

import com.hellozjf.ticket12306.service.StationNameService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author hellozjf
 */
@Slf4j
@Service
public class StationNameServiceImpl implements StationNameService {

    private Map<String, String> nameCodeMap = new HashMap<>();
    private String stationNameUrl = "";

    @Override
    public String getStationNameUrl() {
        return stationNameUrl;
    }

    @Override
    public void updateStationNameUrl(String stationNameUrl) {
        this.stationNameUrl = stationNameUrl;
    }

    @Override
    public void updateStationName(String line) {
        Pattern pattern = Pattern.compile("var station_names ='(.*)';");
        Matcher matcher = pattern.matcher(line);
        if (matcher.find()) {
            String[] infos = matcher.group(1).split("@");
            for (int i = 1; i < infos.length; i++) {
                String info = infos[i];
                String[] rs = info.split("\\|");
                nameCodeMap.put(rs[1], rs[2]);
            }
        }
    }

    @Override
    public String getStationCode(String stationName) {
        return nameCodeMap.get(stationName);
    }
}

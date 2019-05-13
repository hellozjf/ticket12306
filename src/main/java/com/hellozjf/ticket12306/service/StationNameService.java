package com.hellozjf.ticket12306.service;

/**
 * @author hellozjf
 */
public interface StationNameService {
    String getStationNameUrl();
    void updateStationNameUrl(String stationNameUrl);
    void updateStationName(String line);
    String getStationCode(String stationName);
}

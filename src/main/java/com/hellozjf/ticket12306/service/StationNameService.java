package com.hellozjf.ticket12306.service;

/**
 * @author hellozjf
 */
public interface StationNameService {
    void updateStationName(String line);
    String getStationCode(String stationName);
}

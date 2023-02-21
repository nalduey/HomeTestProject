package com.sealed.parkinglot.controller;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;


import javax.transaction.Transactional;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
@AutoConfigureMockMvc
@Transactional
public class ParkingLotControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    @DisplayName("When requesting parking lot is full return a boolean if is ok")
    void callIsParkingLotFull () throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("http://localhost:8080/api/v1/sealed/parking-lot/is-full/parking-row-id/1"))
                        .andDo(print()).andExpect(status().is(200));
    }

    @Test
    @DisplayName("When requesting getSpotAvailableCount if is ok")
    void callGetSpotAvailableCount () throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("http://localhost:8080/api/v1/sealed/parking-lot/spot_available_count/parking-row-id/1"))
                .andDo(print()).andExpect(status().is(200));
    }

}

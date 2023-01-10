package com.jio.life.util;

import com.jio.life.model.PassengerInfo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Responce {

	private String status;
    private double totalFare;
  //  private String pnrNo;
    private PassengerInfo passengerInfo;
}

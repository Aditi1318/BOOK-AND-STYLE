package com.zosh.controller;

import com.zosh.modal.Booking;
import com.zosh.payload.dto.SalonDTO;
import com.zosh.service.BookingService;
import com.zosh.service.clients.SalonFeignClient;
import com.zosh.service.impl.BookingChartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/bookings/chart")
public class ChartController {

    @Autowired
    private BookingChartService bookingChartService;
    @Autowired
    private BookingService bookingService;
    @Autowired
    private SalonFeignClient salonService;

    @GetMapping("/earnings")
    public ResponseEntity<List<Map<String, Object>>> getEarningsChartData(
            @RequestHeader("Authorization") String jwt) throws Exception {

//        UserDTO user = userService.getUserFromJwtToken(jwt).getBody();

        SalonDTO salon = salonService.getSalonByOwner(jwt).getBody();
        List<Booking> bookings=bookingService.getBookingsBySalon(salon.getId());

        // Generate chart data
        List<Map<String, Object>> chartData = bookingChartService
                .generateEarningsChartData(bookings);

        return ResponseEntity.ok(chartData);

    }

    @GetMapping("/bookings")
    public ResponseEntity<List<Map<String, Object>>> getBookingsChartData(
            @RequestHeader("Authorization") String jwt) throws Exception {

        SalonDTO salon = salonService.getSalonByOwner(jwt).getBody();
        List<Booking> bookings=bookingService.getBookingsBySalon(salon.getId());
        // Generate chart data
        List<Map<String, Object>> chartData = bookingChartService.generateBookingCountChartData(bookings);

        return ResponseEntity.ok(chartData);

    }
}

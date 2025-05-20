package com.chezaida.chezaidaservice.service.interfac;

import com.chezaida.chezaidaservice.dto.Response;
import com.chezaida.chezaidaservice.entity.Booking;

public interface IBookingService {
    Response saveBooking(Long rooId, Long userId, Booking bookingRequest);
    Response findBookingByConfirmationCode(String confirmationCode);
    Response getAllBookings();
    Response cancelBooking(Long bookingId);
}

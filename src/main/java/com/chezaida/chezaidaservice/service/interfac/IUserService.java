package com.chezaida.chezaidaservice.service.interfac;

import com.chezaida.chezaidaservice.dto.LoginRequest;
import com.chezaida.chezaidaservice.dto.Response;
import com.chezaida.chezaidaservice.entity.User;

public interface IUserService {
    Response register(User user);
    Response login(LoginRequest loginRequest);
    Response getAllUsers();
    Response getUSerBookingHistory(String userId);
    Response deleteUser(String userId);
    Response getUserById(String userId);
    Response getMyInfo(String email);
}

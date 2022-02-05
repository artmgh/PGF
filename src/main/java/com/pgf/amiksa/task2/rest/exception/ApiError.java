package com.pgf.amiksa.task2.rest.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
@AllArgsConstructor
public class ApiError {

    private String exceptionMessage;
    private String httpStatus;

}

package com.healthmotiveserver.handler;

import com.healthmotiveserver.response.BaseErrorCode;

public class StageHandler extends GeneralException {
    public StageHandler(BaseErrorCode code) {
        super(code);
    }
}

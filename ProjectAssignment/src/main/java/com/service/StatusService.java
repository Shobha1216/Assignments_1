package com.service;

import com.models.StatusClass;

import java.util.List;

public interface StatusService {

    List<StatusClass> getWithStatus();
    List<StatusClass> getForParticularIntern();
}

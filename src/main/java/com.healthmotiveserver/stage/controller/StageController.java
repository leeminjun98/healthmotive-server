package com.healthmotiveserver.stage.controller;


import com.healthmotiveserver.stage.service.StageService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/stage")
public class StageController {
    private final StageService stageService;










}

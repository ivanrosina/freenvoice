package org.freenvoice.controllers;

import org.freenvoice.models.Sample;
import org.freenvoice.services.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sample")
public class SampleController extends CrudController<Sample, SampleService> {
    
    @Autowired
    @Override
    public void setService(SampleService service) {
        this.service = service;
    }

    @Override
    public Boolean isAuthorized(Long entityId, SampleService service) {
        return true;
    }
}

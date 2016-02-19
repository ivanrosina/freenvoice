package org.freenvoice.services;

import org.freenvoice.models.Sample;
import org.freenvoice.repositories.SampleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SampleService extends CrudService<Sample, SampleRepository> {

    @Autowired
    @Override
    public void setRepo(SampleRepository repo) {
        this.repo = repo;
    }

    @Override
    public Sample copy(Sample from, Sample to) {
        to = from;
        return to;
    }

}

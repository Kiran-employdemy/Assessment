package com.assesment.core.services;

import java.util.List;

import com.day.cq.wcm.api.Page;

public interface AssesmentService {
    List<Page> getPages(String path);
}

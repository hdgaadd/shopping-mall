package com.codeman.entity;

import com.codeman.domain.Product;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class HomeFlashPromotion {

    private LocalDateTime startTime;

    private LocalDateTime endTime;

    private LocalDateTime nextStartTime;

    private LocalDateTime nextEndTimwe;

    List<Product> productList;

}

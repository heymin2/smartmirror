package com.sixback.backend.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OptionDto {
	private Long optionId;
	private String optionName;
	private String optionImage;
	private Long optionPrice;
	private Long optionDiscountPrice;
	private int stock;
	private boolean isInMarket;
}

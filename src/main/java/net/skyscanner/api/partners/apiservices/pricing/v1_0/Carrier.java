package net.skyscanner.api.partners.apiservices.pricing.v1_0;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import net.skyscanner.api.partners.apiservices.AbstractResponse;

@JsonNaming(PropertyNamingStrategy.UpperCamelCaseStrategy.class)
@Setter
@Getter
@ToString
@Slf4j
public class Carrier extends AbstractResponse {

    private Long id;

    private String code;

    private String name;

    private String imageUrl;

    private String displayCode;
}

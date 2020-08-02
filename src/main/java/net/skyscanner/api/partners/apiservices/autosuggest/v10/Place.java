package net.skyscanner.api.partners.apiservices.autosuggest.v10;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@JsonNaming(PropertyNamingStrategy.UpperCamelCaseStrategy.class)
@ToString
@Setter
@Getter
@Slf4j
public class Place {

    private String placeId;

    private String placeName;

    private String countryId;

    private String regionId;

    private String cityId;

    private String countryName;
}

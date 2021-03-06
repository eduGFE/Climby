package com.climbtogether.climby.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

import com.climbtogether.climby.domain.Province;
import com.climbtogether.climby.domain.Travel;
import com.climbtogether.climby.dto.ProvinceDTO;
import com.climbtogether.climby.dto.TravelDTO;


@Mapper(componentModel = "spring")
public interface ProvinceMapper {
	
	Province provinceDTOToprovince(ProvinceDTO provinceDTO);
	
	ProvinceDTO provinceToprovinceDTO(Province province);

	List<ProvinceDTO> listProvinceToListProvinceDTO(List<Province> travel);
		

}

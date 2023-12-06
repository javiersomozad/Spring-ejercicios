package es.jsomoza.mapstruct.mappings;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import es.jsomoza.mapstruct.domain.House;
import es.jsomoza.mapstruct.dto.HouseDTO;

@Mapper(componentModel = "spring")
public interface HouseToHouseDTOMapper {
	HouseToHouseDTOMapper INSTANCE = Mappers.getMapper(HouseToHouseDTOMapper.class);
	
	HouseDTO houseToHouseDTO(House house);
	House houseDTOToHouse(HouseDTO houseDTO);
}
package es.jsomoza.mapstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import es.jsomoza.mapstruct.domain.House;
import es.jsomoza.mapstruct.domain.Owner;
import es.jsomoza.mapstruct.domain.repositories.HouseRepository;
import es.jsomoza.mapstruct.domain.repositories.OwnerRepository;
import es.jsomoza.mapstruct.dto.OwnerDTO;
import es.jsomoza.mapstruct.mappings.HouseToHouseDTOMapper;
import es.jsomoza.mapstruct.mappings.OwnerToOwnerDTOMapper;
import jakarta.transaction.Transactional;

@SpringBootApplication
public class MapstructApplication implements CommandLineRunner {
	
	 @Autowired
	 private OwnerRepository ownerRepository;
	 
	 @Autowired
	 private HouseRepository houseRepository;
	 
	 @Autowired
	 private OwnerToOwnerDTOMapper ownerToOwnerDTOMapper;
	 
	 @Autowired
	 private HouseToHouseDTOMapper houseToHouseDTOMapper;
	 
	public static void main(String[] args) {
		SpringApplication.run(MapstructApplication.class, args);
	}

	@Transactional
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Muestra todos los registros");
		for (House house : houseRepository.findAll()) {
		   System.out.println(house);
		}
		  
		System.out.println("Showing all records");
		for (Owner owner : ownerRepository.findAll()) {
		   System.out.println(owner);
		}
		
		System.out.println("conviertiendo repositorio a DTO :");
		Owner owner = ownerRepository.findById(1L).get();
		OwnerDTO ownerDTO = ownerToOwnerDTOMapper.ownerToOwnerDTO(owner);
		System.out.println(owner);
		System.out.println(ownerDTO);
		System.out.println("ahora de DTO a repositorio :");
		System.out.println(ownerToOwnerDTOMapper.ownerDTOToOwner(ownerDTO));  
		  
		System.out.println("conviertiendo repositorio a DTO (ahora con House):");
		Iterable<House> houses = houseRepository.findAll();

		for (House house: houses) {
			   System.out.println(house);
			   System.out.println(houseToHouseDTOMapper.houseToHouseDTO(house));
		}
		
	}

}

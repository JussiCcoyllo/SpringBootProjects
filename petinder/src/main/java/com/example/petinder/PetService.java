package com.example.petinder;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;
public class PetService {
    private final PetRepository petRepository;
    private final PetMapper petMapper;


    public PetService(PetRepository petRepository, PetMapper petMapper) {
        this.petRepository = petRepository;
        this.petMapper = petMapper;
    }

    public List<PetDTO> getAllPets() {
        List<Pet> pets = petRepository.getAllPets();
        return petMapper.toDTO(pets);
    }
}


package com.example.petinder;

import java.util.List;
import java.util.stream.Collectors;

public class PetMapper {
    public List<PetDTO> toDTO(List<Pet> petList) {
        return petList.stream().map(this::toDTO).collect(Collectors.toList());
    }

    public PetDTO toDTO(Pet pet) {
        return new PetDTO(
                pet.getId(),
                pet.getName(),
                pet.getKind(),
                pet.getProfileText()
        );
    }
}


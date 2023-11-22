package com.example.petinder;

import java.util.List;

public class PetRepository {
    public List<Pet> getAllPets() {
        return List.of(
                new Pet(1L, "Fluffy", "Cat", "Loves to sleep in the sun."),
                new Pet(2L, "Buddy", "Dog", "Always ready for a game of fetch."),
                new Pet(3L, "Cluckers", "Chicken", "Expert bug hunter.")
        );
    }
}
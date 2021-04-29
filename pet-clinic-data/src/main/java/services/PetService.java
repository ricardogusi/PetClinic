package services;

import java.util.Set;

import model.Pet;

public interface PetService {

	Pet findById(Long id);

	Pet save(Pet owner);

	Set<Pet> findAll();
}
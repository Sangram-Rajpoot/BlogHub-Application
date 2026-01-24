package com.bloghub.service;

import com.bloghub.dto.AuthorUpdateDto;
import com.bloghub.entity.Author;
import com.bloghub.exception.ResourceNotFoundException;
import com.bloghub.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service// Indicates that this class is a service component in the Spring framework
public class AuthorService {
    private AuthorRepository authorRepository;// Repository for author data access

    @Autowired
    public AuthorService(AuthorRepository authorRepository) {// Constructor injection of the AuthorRepository
        this.authorRepository = authorRepository;// Initialize the repository
    }

    public List<Author> getAllAuthors() {
        return authorRepository.findAll();// Retrieve all authors from the repository
    }

    public Author getAuthorById(Long id) {
        Author author = authorRepository.findById(id).orElse(null);// Fetch author by ID
        if (author == null) {// Check if author exists
            throw new ResourceNotFoundException("Author not found with id: " + id);// Throw exception if not found
        }

        return author;// Retrieve an author by ID, throwing an exception if not found
    }

    public Author deleteAuthorById(Long id) {
        Author author = getAuthorById(id);// Fetch author by ID
        authorRepository.deleteById(id);// Delete the author by ID
        return author;// Return the deleted author
    }
    public Author  updateAuthorById(Long id, AuthorUpdateDto)
}

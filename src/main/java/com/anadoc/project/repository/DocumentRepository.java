package com.anadoc.project.repository;

import com.anadoc.project.models.Document;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocumentRepository extends JpaRepository<Document,Integer> {
    Document findByname(String name);
}

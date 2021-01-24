package com.anadoc.project.service;

import com.anadoc.project.models.Document;
import com.anadoc.project.repository.DocumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocumentService {
    @Autowired
    private DocumentRepository documentRepository;

    public Document saveDocument(Document document) {
        return documentRepository.save(document);
    }

    public List<Document> saveDocuments(List<Document> documents){
        return documentRepository.saveAll(documents);
    }

    public List<Document> getAllDocuments(){
        return documentRepository.findAll();
    }

    public Document getDocumentById(int id){
        return documentRepository.findById(id).orElse(null);
    }

    public Document findDocumentByName(String name){
        return documentRepository.findByname(name);
    }

    public String deleteDocument(int id){
        documentRepository.deleteById(id);
        return "Document removed!";
    }

    public Document update(Document document){
        Document existingDocument = documentRepository.findById(document.getId()).orElse(null);
        existingDocument.setName(document.getName());
        existingDocument.setDescription(document.getDescription());
        existingDocument.setFormat(document.getFormat());
        existingDocument.setCourse(document.getCourse());
        existingDocument.setTeacher(document.getTeacher());
        return documentRepository.save(existingDocument);
    }


}

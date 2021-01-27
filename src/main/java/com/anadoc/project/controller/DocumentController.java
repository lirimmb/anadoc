package com.anadoc.project.controller;

import com.anadoc.project.models.Commission;
import com.anadoc.project.models.Document;
import com.anadoc.project.service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DocumentController {

    @Autowired
    private DocumentService service;

    @PostMapping("/addDocument")
    public Document adsdDocument(@RequestBody Document document){
        return service.saveDocument(document);
    }

    @PostMapping("/addDocuments")
    public List<Document> addDocuments(@RequestBody List<Document> documents){
        return service.saveDocuments(documents);
    }

    @GetMapping("/documents")
    public List<Document> findAllDocuments(){
        return service.getAllDocuments();
    }

    @GetMapping("/document/{id}")
    public Document findDocumentById(@PathVariable int id){
        return service.getDocumentById(id);
    }

    @PutMapping("/update")
    public Document updateDocument(@RequestBody Document document){
        return service.update(document);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteDocument(@PathVariable int id){
        return service.deleteDocument(id);
    }
}

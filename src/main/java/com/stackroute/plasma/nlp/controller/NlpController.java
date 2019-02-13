package com.stackroute.plasma.nlp.controller;

import com.stackroute.plasma.nlp.service.StopWord;
import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1")
public class NlpController {

    @Autowired
    private StanfordCoreNLP stanfordCoreNLP;
   // @Autowired
    StopWord stopWord = new StopWord();
    @PostMapping("/token")
    public List<String> convertToToken(@RequestBody final String input) {
        CoreDocument coreDocument = new CoreDocument(input);
        stanfordCoreNLP.annotate(coreDocument);
        List<CoreLabel> coreLabels = coreDocument.tokens();
        for (CoreLabel c: coreLabels
             ) {
            System.out.println(c);
        }
        return coreLabels.stream().map(CoreLabel::originalText).collect(Collectors.toList());

    }
    @PostMapping("/lemmatoken")
    public List<String> convertToLemma(@RequestBody final String input) {
        CoreDocument coreDocument = new CoreDocument(input);
        stanfordCoreNLP.annotate(coreDocument);
        List<CoreLabel> coreLabels = coreDocument.tokens();
        String lemma;
        List<String> finalString = new ArrayList<>();
        for (CoreLabel coreLabel: coreLabels
        ) {
            lemma = coreLabel.lemma();
            if (!(stopWord.getStopwords().contains(lemma))) {
                finalString.add(lemma);
            }
            // finalString.add(lemma);
            // System.out.println(lemma);
        }
       // return coreLabels.stream().map(CoreLabel::originalText).collect(Collectors.toList());
        return finalString.stream().map(String::toString).collect(Collectors.toList());
    }




}


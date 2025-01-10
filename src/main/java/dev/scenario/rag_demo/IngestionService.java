package dev.scenario.rag_demo;

import org.springframework.ai.reader.pdf.ParagraphPdfDocumentReader;
import org.springframework.ai.vectorstore.VectorStore;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;
import org.springframework.ai.transformer.splitter.TextSplitter;
import org.springframework.ai.transformer.splitter.TokenTextSplitter;
import lombok.extern.slf4j.Slf4j;


@Slf4j
@Component
public class IngestionService implements CommandLineRunner {

    private final VectorStore vectorStore;

    @Value("classpath:/docs/Financial_Tables_Dell.pdf")
    private Resource marketPDF;

    public IngestionService (VectorStore vectorStore)
    {
        this.vectorStore = vectorStore;
    }

    @Override
    public void run(String... args) throws Exception {
        var pdfReader = new ParagraphPdfDocumentReader(marketPDF);
        TextSplitter textSplitter = new TokenTextSplitter();
        vectorStore.accept(textSplitter.apply(pdfReader.get()));
        log.info("VectorStore loaded with data");

    }


    
}

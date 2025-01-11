(1) The ChatController class is a RESTful controller that initializes a chatClient with a QuestionAnswerAdvisor. It has an endpoint that prompts the user for a question, makes a call, and returns the response. The constructor accepts ChatClient.Builder and PgVectorStore for initialization.


(2) The IngestionService class is a Spring component that runs on application startup. It reads a PDF document into text, splits the text, and stores it in a VectorStore. The class is configured to run using the CommandLineRunner interface.

(3) Flow

(localhost:8080)
User Query ➔ 

(restcontroller)
Spring Boot App ➔ 

(pgvector DB)
Retrieve Data from Vector DB ➔ 

(Springboot ChatClient integration)
Create Context from Retrieved Data ➔ 

(Open AI API call)
LLM (Generate Answer) ➔ 

Response to User Query

The ChatController class is a RESTful controller that initializes a chatClient with a QuestionAnswerAdvisor. It has an endpoint at / that prompts the user for a question, makes a call, and returns the response. The constructor accepts ChatClient.Builder and PgVectorStore for initialization.



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

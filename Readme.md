┌───────────────┐
│ User Query    │
└───────┬───────┘
        │
        │
        ▼
┌───────────────┐
│Spring Boot App│
└───────┬───────┘
        │
        │
        ▼
┌───────────────┐
│Retrieve Data  │
│from Vector DB │
└───────┬───────┘
        │
        │
        ▼
┌───────────────┐
│Create Context │
│from Retrieved │
│   Data        │
└───────┬───────┘
        │
        │
        ▼
┌───────────────┐
│     LLM       │
│Generate Answer│
└───────┬───────┘
        │
        │
        ▼
┌───────────────┐
│  Response     │
│to User Query  │
└───────────────┘
-

# Bank Account Management Application with Axon Framework (CQRS, Event Sourcing Patterns)

```
the objective of this project is to create a robust application for managing bank accounts, incorporating the principles of CQRS
(Command Query Responsibility Segregation) and Event Sourcing patterns. Using the Axon and Spring Boot frameworks,
users will have the capability to effectively oversee various aspects of their bank accounts. This includes tasks
 such as establishing new accounts, depositing and withdrawing funds, and keeping track of account balances.
```
## Table of Contents

- [Key Concepts](#key-concepts)
- [Prerequisites](#prerequisites)
- [Project Structure](#project-structure)
- [Tests](#tests)



## Key Concepts

- Command Query Responsibility Segregation (CQRS) and Event Sourcing (ES) are two architectural patterns that are often used together. 

  - **CQRS** : separates the handling of commands (which update the system state) from the handling of queries (which read the system state). 

  - **ES**  : is a way of storing data as a sequence of events, rather than as a snapshot of the current state.

- There are a number of benefits to using CQRS and ES together. These benefits include:

  - Improved performance, Increased scalability, Improved auditability, Simplified development

## Prerequisites

- Java 8
- Axon 
- Spring Boot 
- MySQL database

## Project Structure
![image](https://raw.githubusercontent.com/oussemou-mohamed/Event_Driven_Distributed_Architecture/master/src/imge/Capture.PNG)

## Tests

Create an application that allows you to manage bank accounts.  


### Command Side

#### 1- Commands

* Create Account

![image](https://github.com/oussemou-mohamed/Event_Driven_Distributed_Architecture/blob/master/src/imge/creat.PNG)

* Credit an account
  
![image](https://github.com/oussemou-mohamed/Event_Driven_Distributed_Architecture/blob/master/src/imge/credit.PNG)

* Debit an account

![image](https://github.com/oussemou-mohamed/Event_Driven_Distributed_Architecture/blob/master/src/imge/debitnormale.PNG)
![image](https://github.com/oussemou-mohamed/Event_Driven_Distributed_Architecture/blob/master/src/imge/debit_balance_not-sufficient.PNG)
![image](https://github.com/oussemou-mohamed/Event_Driven_Distributed_Architecture/blob/master/src/imge/debit-negative-amaunt.PNG)

#### 2- Events 

* EventStore Data Base

![image](https://github.com/oussemou-mohamed/Event_Driven_Distributed_Architecture/blob/master/src/imge/EventStore%20Data%20Base.PNG)



### Query Side

* Query Data base
  
`ACCOUNT Table`

![image](https://github.com/oussemou-mohamed/Event_Driven_Distributed_Architecture/blob/master/src/imge/ACCOUNT%20Table.PNG)

`OPERATION Table`

![image](https://github.com/oussemou-mohamed/Event_Driven_Distributed_Architecture/blob/master/src/imge/OPERATION%20Table.PNG)


* All accounts

![image](https://github.com/oussemou-mohamed/Event_Driven_Distributed_Architecture/blob/master/src/imge/All%20accounts.PNG)

* Account By ID

![image](https://github.com/oussemou-mohamed/Event_Driven_Distributed_Architecture/blob/master/src/imge/Account%20By%20ID.PNG)



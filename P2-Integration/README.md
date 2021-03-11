# Integration: Service Oriented Model / RPC Paradigm
## Problem
The client/server model allows different processes to communicate remotely. However, designing and developing a client/server application is tedious. Indeed, it requires:
- Designing a specific protocol or, in the best case, adopting and adapting an existing (maybe standard) protocol
- Managing connections, as well as corresponding streams, on both sides
- Implementing the protocol, including (application) error management, on both sides

Also, the more services/functionality the protocol supports, the more tedious the whole process becomes!

## Objective
Can we imagine a programming paradigm, which provides us software developers, with: *the luxury to invoke remote services/functionality, as if they were local*!?

Such a paradigm would by hide all the programming hassle and details mentioned above, hence:
- increase *devloper productivity*
- promote *software integration* for:
  - richer functionality
  - higher performance

## Examples
- Getting the weather of a given city from a specialized provider, such as Yahoo! Weather (Richer functionality): you don't have the necessary data to do it yourself!
- Translating text using a specialized service, such as Google Translate (Richer functionality): you don't have the algorithms and data to do it yourself!
- Inversing large matrices using a specialized service (Higher performance): you may not have the necessary processing power!

## Brainstorming
If you were to design and develop a traditional client/server application that allows the client to perform 

## Architecture
<p align="center"><img src="figures/architecture.png"></p>

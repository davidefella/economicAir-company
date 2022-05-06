# economicAir-company

Si vuole progettare una applicazione per gestire prenotazione dei voli per la compagnia aerea EconomicAir Company. 

In particolare: 

- Prevedere un catalogo dei voli con i seguenti dati: 
	- Aeroporto di partenza
	- Aeroporto di arrivo 
	- Data e ora di partenza 
	- Data e ora di arrivo

- Ogni aeroporto è una entità di cui vogliamo memorizzare: 
	- Nome Aeroporto (Es "Aeroporto internazionale Leonardo da Vinci) 
	- Città (Es "Fiumicino") 
	- Nazione (Es "Italia") 
	- Codice aeroporto (FCO) 

- Ogni prenotazione ha i seguenti dati: 
	- Un codice alfanumerico di 6 caratteri (es "AZ7868)
	- Il codice del posto di bordo (es "A45")
	- Una descrizione (es "Posto finestrino) 
	- Costo del biglietto

Dopo aver analizzato il testo:

1. Crea un nuovo progetto Spring chiamato EconomicAir ed imposta le dipendenze Spring necessarie

2. Crea le entità che modellano il dominio applicativo

3. Crea i layer MVC necessari per le CRUD di base e maschere front end

5. Imposta il logging su file e console

6. Realizza per ogni entità i servizi REST associati e le Collection su Postman per i test

7. Predisponi una batteria base di test JUnit 

6. Predisponi una serie di dati di test per l'inizializzazione del database sfruttando i metodi offerti dai repository.
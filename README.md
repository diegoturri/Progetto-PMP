# Progetto-PMP

Per effettuare un test di riconoscimento delle espressioni facciali più comuni:

  1- avviare il passaggio 1 e 2
  
  3- il database delle espressioni più comuni è già interno al Python Notebook quindi non c'è bisogno di aggiungerne
  
  4- avviare il passaggio 3 utilizzando come file di estrazione il file .txt corrispondente all'espressione da imparare contenuto in /facial_expressions/ quindi per 
  esempio "anger.txt"
  
  5- avviare il passaggio 4 come cartella di destinazione le varie espressioni da riconoscere come "data_set/anger". in questo passaggio verrà richiesto un
  identificativo da associare all'espressione con cui poi il software salverà le immagini in dataset, attenzione a far corrispondere l'identificativo scelto per
  l'espressione che stiamo salvando con l'indice dell'array "names" nel passaggio 6. Quindi se assegno ad "anger" id=0 nel passaggio 4, nel passaggio 6 ci dovrà
  essere "anger" come valore dell'array in posizione 0
  
  6- una volta eseguito il passaggio 3 e 4 per ogni espressione che si vuole insegnare avviare il passaggio 5
  
  7- avviare il passaggio 6. Si può modificare l'immagine da analizzare importando la nuova immagine nel notebook e modificando il percorso di selezione immagine ed
  il nome con cui verrà salvata l'immagine risultante
  
  8- avviare il passaggio 7. Se si ha utilizzato una nuova immagine si deve modificare il percorso di selezione immagine (questo passaggio è adibito alla sola
  visualizzazione del risultato)
  
  
  
Per effettuare invece un test di riconoscimento del dolore bisogna prima addestrarlo usando il database contenuto nella repository quindi non interno al Python Notebook (servirà anche un programma java di supporto):

  1- avviare il passaggio 1
  
  2- avviare il passaggio 2 inserendo un ulteriore cartella chiamata pain
  
  3- inserire le immagini del database della repository che si vogliono utilizzare nella cartella /facial_expressions/images del Python Notebook
  
  4- utilizzare il programma java all'interno della repository per estrarre i nomi di tutte le immagini scelte in precedenza (basta cambiare il path di estrazione
  all'interno del programma). Il risultato va salvato in un nuovo file chiamato pain.txt
  
  5- avviare il passaggio 3 utilizzando come file di estrazione il file .txt corrispondente all'espressione da imparare contenuto in /facial_expressions/ quindi per 
  esempio "anger.txt"
  
  6- avviare il passaggio 4 utilizzando come cartella di destinazione le varie espressioni da riconoscere come "data_set/pain" creata in precedenza. in questo
  passaggio verrà richiesto un identificativo da aassociare all'espressione con cui poi il software salverà le immagini in dataset, attenzione a far corrispondere
  l'identificativo scelto per l'espressione che stiamo salvando con l'indice dell'array "names" nel passaggio 6. Quindi se assegno ad "anger" id=0 nel passaggio 4,
  nel passaggio 6 ci dovrà essere "anger" come valore dell'array in posizione 0
  
  7- una volta eseguito il passaggio 3 e 4 per ogni espressione che si vuole insegnare avviare il passaggio 5
  
  8- avviare il passaggio 6. Si può modificare l'immagine da analizzare importando la nuova immagine nel notebook e modificando il percorso di selezione immagine ed
  il nome con cui verrà salvata l'immagine risultante
  
  9- avviare il passaggio 7. Se si ha utilizzato una nuova immagine si deve modificare il percorso di selezione immagine (questo passaggio è adibito alla sola
  visualizzazione del risultato)
  
  

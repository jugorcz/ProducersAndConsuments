# ProducersAndConsuments

COUNTER
Program w ktorym jeden watek inkrementuje pewna zmienna 100000000 razy, drugi ja dekrementuje 100000000. Czy wynik zawsze jest zero? 
Wprowadzic synchronizacje do programu wykorzystujac slowo kluczowe "synchronized"

BUFFER
Mamy klika procesów produkujacych wiadomosci (szkielet kodu) i kilka konsumujacych wiadomosci (szkielet kodu) do/z jednoelementowego bufora. Zadaniem jest napisanie klasy Buffer z metodami put i take, tak, aby dostep byl synchronizowany uzywajac monitora Javy dla obiektu klasy Buffer. Kazda wiadomosc jest produkowana przez jednego producenta i konsumowana przez jednego, dowolnego konsumenta.
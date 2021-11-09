# System aukcyjny

## Wprowadzenie

Specyfikacja wymagań funkcjonalnych w ramach informatyzacji procesu sprzedaży produktów w oparciu o mechanizm aukcyjny. 

## Procesy biznesowe

---
<a id="bc1"></a>
### BC1: Sprzedaż aukcyjna 

**Aktorzy:** [Sprzedający](#ac1), [Kupujący](#ac2)

**Opis:** Proces biznesowy opisujący sprzedaż za pomocą mechanizmu aukcyjnego. |

**Scenariusz główny:**
1. [Sprzedający](#ac1) wystawia produkt na aukcję. ([UC1](#uc1))
2. [Kupujący](#ac2) oferuje kwotę za produkt wyższą od aktualnie najwyższej oferty. ([BR1](#br1))
3. [Kupujący](#ac2) wygrywa aukcję ([BR2](#br2))
4. [Kupujący](#ac2) przekazuje należność Sprzedającemu.
5. [Sprzedający](#ac1) przekazuje produkt Kupującemu.

**Scenariusze alternatywne:** 

2.A. Oferta Kupującego została przebita, a [Kupujący](#ac2) pragnie przebić aktualnie najwyższą ofertę.
* 2.A.1. Przejdź do kroku 2.

3.A. Czas aukcji upłynął i [Kupujący](#ac2) przegrał aukcję. ([BR2](#br2))
* 3.A.1. Koniec przypadku użycia.

---

## Aktorzy

<a id="ac1"></a>
### AC1: Sprzedający

Osoba oferująca towar na aukcji.

<a id="ac2"></a>
### AC2: Kupujący

Osoba chcąca zakupić produkt na aukcji.


## Przypadki użycia poziomu użytkownika

### Aktorzy i ich cele

[Sprzedający](#ac1):
* [UC1](#uc1): Wystawienie produktu na aukcję
* [UC2](#uc2): Zmienienie statusu przesyłki

[Kupujący](#ac2)
* [UC3](#uc3): Zalicytowanie w aukcji*
* [UC4](#uc4): Wygranie aukcji*
* [UC5](#uc5): Przegranie aukcji
* [UC6](#uc6): Opłacenie przedmiotu*

---
<a id="uc1"></a>
### UC1: Wystawienie produktu na aukcję

**Aktorzy:** [Sprzedający](#ac1)

**Scenariusz główny:**
1. [Sprzedający](#ac1) zgłasza do systemu chęć wystawienia produktu na aukcję.
2. System prosi o podanie danych produktu i ceny wywoławc-zej.
3. [Sprzedający](#ac1) podaje dane produktu oraz cenę wywoławczą.
4. System weryfikuje poprawność danych.
5. System informuje o pomyślnym wystawieniu produktu na aukcję.

**Scenariusze alternatywne:** 

4.A. Podano niepoprawne lub niekompletne dane produktu.
* 4.A.1. System informuje o błędnie podanych danych.
* 4.A.2. Przejdź do kroku 2.

---

<a id="uc2"></a>
### UC2: ...

**Aktorzy:** [Sprzedający](#ac1), [Kupujący](#ac2), ...

**Scenariusz główny:**
1. ...

**Scenariusze alternatywne:** 

1.A. ...
* 4.A.1. ...

---

<a id="uc3"></a>
### UC3: Zalicytowanie w aukcji

**Aktorzy:** [Kupujący](#ac2)

**Scenariusz główny:**
1. [Kupujący](#ac2) włącza okno aukcji oraz klika opcję licytowania przedmiotu.
2. System przedstawia aktualną wartość przedmiotu i prosi o podanie danych osobowych oraz kwoty.
3. [Kupujący](#ac2) uzupełnia dane osobowe oraz kwotę wyższą od podanej przez system.
4. System zatwierdza podane dane.
5. System informuje o pomyślnym zalicytowaniu przedmiotu na aukcji.

**Scenariusze alternatywne:** 
4.A. Podano kowtę niższą lub równą od aktualnej wartości produktu.
* 4.A.1. System informuje o błędnie podanych danych.
* 4.A.2. Przejdź do kroku 2.

---

<a id="uc4"></a>
### UC4: Wygranie aukcji

**Aktorzy:** [Sprzedający](#ac1), [Kupujący](#ac2)

**Scenariusz główny:**
1. System kończy aukcję i przekazuje informacje do [Kupujący](#ac2).
2. System przekazuje informacje [Sprzedający](#ac1) z damymi [Kupujący](#ac2).

**Scenariusze alternatywne:** 
1.A. Aukcja zakończyła się ale nikt nie zalicytował
* 1.A.1. System informuje [Sprzedający](#ac1) o braku zainteresowanych.


---

<a id="uc6"></a>
### UC6: Opłacenie przedmiotu

**Aktorzy:** [Kupujący](#ac2)

**Scenariusz główny:**
1. [Kupujący](#ac2) wybiera opcję opłacenia wygranych aukcji i wybiera tę, którą chce opłacić.
2. System wyświetla [Kupujący](#ac2) informacje o przedmiocie, kwotę którą [Kupujący](#ac2) musi uiścić oraz pozostały czas na dokonanie transakcji.
3. [Kupujący](#ac2) wybiera przycisk akceptacji i przeniesienia do systemu obsługującego płatności.
4. System oczekuje na potwierdzenie opłat.
5. System informuje [Kupujący](#ac2) o zakończeniu transakcji.

**Scenariusze alternatywne:** 
2.A. Brak możliwości opłacenia przedmiotu
* 2.A.1. System informuje [Kupujący](#ac2) o braku możliwości opłacenia należności z powodu zbyt długiego oczekiwania.

4.A. System nie otrzymał informacji z potwierdzeniem płatności
* 2.A.1. System informuje [Kupujący](#ac2) o niepowodzeniu płatności
* 2.A.2. Przejdź do kroku 2.

---

## Obiewkty biznesowe (inaczje obiekty dziedzinowe lub informatycjne)

### BO1: Aukcja

Aukcja jest formą zawierania transakcji kupna-sprzedaży, w której Sprzedający określa cenę wywoławczą produktu, natomiast Kupujący mogą oferować własną ofertę zakupu każdorazowo proponując kwotę wyższą od aktualnie oferowanej kwoty. Aukcja kończy się po upływie określonego czasu. Jeśli złożona została co najmniej jedna oferta zakupy produkt nabywa ten Kupujący, który zaproponował najwyższą kwotę. 

### BO2: Produkt

Fizyczny lub cyfrowy obiekt, który ma zostać sprzedany w ramach aukcji.

## Reguły biznesowe

<a id="br1"></a>
### BR1: Złożenie oferty

Złożenie oferty wymaga zaproponowania kwoty wyższej niż aktualnie oferowana o minimum 1,00 PLN.


<a id="br2"></a>
### BR2: Rozstrzygnięcie aukcji

Aukcję wygrywa ten z [Kupujący](#ac2)ch, który w momencie jej zakończenia (upłynięcia czasu) złożył najwyższą ofertę.

## Macierz CRUDL


| Przypadek użycia                                  | Aukcja | Produkt | ... |
| ------------------------------------------------- | ------ | ------- | --- |
| UC1: Wystawienia produktu na aukcję               |    C   |    C    | ... |
| ???                                               |  ...   |  ...    | ... |



# SEW GK1 / Pull.Observer-Pattern (HOEK)
Das TGM verfügt in einem Programm über eine Liste aller Sprechstunden. Jedes **Sprechstundenobjekt** ist mit diversen Informationen (Name des Lehrers, Raumnummer, Wochentag, Beginn und Ende) ausgestattet. Die Sprechstunden ändern sich großteils einmal im Jahr, können sich aber auch während des Jahres ändern. Z.B. können auch neue Lehrer hinzukommen oder Lehrer von der Schule gehen.


Die Sprechstundenliste wird auch auf der Website abgebildet und die Daten sollten natürlich immer aktuell sein. Leider ist die Verwaltung bei Änderungen recht mühsam, da die Liste auf der Website derzeit manuell bearbeitet wird.


Von daher soll das System umgestellt werden, sodass ein Objekt einer **Pull.WebService-Klasse** alle Änderungen automatisch mitbekommt (im weiteren Verlauf dient diese Klasse dann zur eigentlichen Darstellung, die uns hier aber nicht weiter interessiert).


Zusätzlich hat nun auch der 2. Stock davon Wind bekommen und hätte gerne alle Informationen per Mail. Dazu wurde intern auch schon an eine **Email-Benachrichtigungsservice-Klasse** gedacht.


Möglicherweise möchten bald auch noch weitere Stellen bzw. Elemente über alle Infos zu den Sprechstunden bzw. deren Änderungen informiert werden oder man ändert im 2. Stock die Meinung und die Email-Benachrichtigung ist ihnen doch nicht so wichtig.


Daher sollte es möglichst einfach sein, neue Elemente bei der Sprechstundenliste an- bzw. abzumelden.


Bitte gib zuerst GK überwiegend ab und arbeite erst danach an GK vollständig weiter.
Link zum leeren Github-Repository: https://classroom.github.com/a/eQIe8uy9 (Achtet auf regelmäßige Commits!)


## Aufgabenstellung GK überwiegend

1. Überlege dir ein Konzept zur Lösung des Problems und erstelle dazu in einem ersten Schritt ein UML-Diagramm. Es sollte zumindest die fett gedruckten Elemente enthalten. Verfolgst du den Push- oder den Pull-Ansatz?
2. Zeige das fertige UML-Diagramm dem betreuenden Lehrer. 
3. Setze im Anschluss das UML-Diagramm in Java um und dokumentiere die wesentlichsten Elemente. Verwende das bereitgestellte Repository und achte auf regelmäßige Commits.
4. Schreibe zusätzlich eine Testklasse in der alle wichtigen Methoden mit entsprechenden Ausgaben getestet werden (an- und abmelden, Änderung der Liste,...).
5. Zeige die Umsetzung deinem betreuenden Lehrer bzw. der betreuenden Lehrerin.


## Aufgabenstellung GK vollständig

1. Überlege dir zusätzlich, welche Änderungen beim anderen Ansatz (Pull- bzw. Push-Ansatz) notwendig wären und entwerfe ein weiteres UML-Diagramm.
2. Erstelle dir am besten eine Kopie deines Projekts und implementiere die notwendigen Änderungen.
3. Auch hier solltest du nicht auf eine entsprechende Dokumentation vergessen und auch eine Testklasse schreiben, in der alle wichtigen Methoden mit entsprechenden Ausgaben getestet werden (an- und abmelden, Änderung der Liste,...).
4. Zeige die Umsetzung deinem betreuenden Lehrer bzw. der betreuenden Lehrerin.

Abgabe: Persönliches Abgabegespräch. Euer dokumentierter Java-Code sowie das UML-Diagramm befinden sich im bereitgestellten Repository (https://classroom.github.com/a/eQIe8uy9).

SEW EK: Siehe Aufgaben aus "Erweiterte Kompetenzen".
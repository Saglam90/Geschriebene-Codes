--1. Bitte ermitteln Sie, welche Interessensnummer wie oft genannt wurde. Erwartet werden pro intnr die Anzahl der Nennungen. Hier ist eine Gruppierung erforderlich.
--Sortieren Sie die Ausgabe nach Anzahl intnr.
SELECT intnr, count(intnr) AS Anzahl 
FROM tl3_mw_interessen 
GROUP BY intnr 
ORDER BY Anzahl DESC

--2. Ermitteln Sie welches Hobbie oder welche Hobbies am meisten genannt wurden. Erwartet wird hier nur die die Anzahl der Nennungen
select top 1 with ties i.inttext, count(mwi.intnr) as Anzahl
from tl3_interessen i join tl3_mw_interessen mwi on i.intnr=mwi.intnr
group by i.inttext
order by count(mwi.intnr) desc

--3. Die drei Personen (Vornamen) mit der höchsten mwnr
SELECT top 3 mwnr, vorname 
FROM tl3_manwoman 
ORDER BY mwnr DESC

--4. Welche intnr (ggf. auch mehrere) wurden am häufigsten genannt? Tipp: top with ties, count
SELECT top 1 with ties count(*) AS Anzahl, intnr 
FROM tl3_mw_interessen 
GROUP BY intnr 
ORDER BY count(*) DESC


--1. Lassen Sie sich die drei niedrigsten Gehälter anzeigen.
SELECT top 3 gehalt
FROM mitarbeiter
WHERE gehalt IS NOT NULL
ORDER BY gehalt ASC

--2. Lassen Sie sich das höchste Gehalt inkl. dem Namen des Mitarbeiters, der es bekommt / bekam, anzeigen.
SELECT top 1 with ties gehalt, name
FROM mitarbeiter
WHERE gehalt IS NOT NULL
ORDER BY gehalt DESC

--3. Lassen Sie sich das höchste Gehalt des Mitarbeiters anzeigen, der sich noch im Unternehmen befindet.
SELECT top 1 with ties gehalt, name
FROM mitarbeiter
WHERE austrittsdatum IS NULL
ORDER BY gehalt DESC

--4. Wie hoch ist das durchschnittliche Einkommen in der Abteilung Vertrieb?
SELECT avg(gehalt) AS Durchschnitt
FROM mitarbeiter m, abteilung a 
WHERE m.abtid = a.abtid AND bezeichnung='Vertrieb'

--5. Wie hoch sind die niedrigsten Gehälter der einzelnen Abteilungen?
SELECT min(gehalt) AS Gehalt, bezeichnung
FROM mitarbeiter m, abteilung a
WHERE m.abtid = a.abtid
GROUP BY bezeichnung

--6. Wie hoch sind die höchsten Gehälter der einzelnen Abteilungen unserer noch bei uns angestellten Mitarbeiter?
SELECT max(gehalt), bezeichnung
FROM mitarbeiter m, abteilung a
WHERE m.abtid = a.abtid AND austrittsdatum IS NULL
GROUP BY bezeichnung

--7. Welche Nachnamen haben unsere Mitarbeiter (keine Wiederholungen der Namen!)?
SELECT DISTINCT name				SELECT name
FROM mitarbeiter				FROM mitarbeiter
						GROUP BY name

/*8 Gesucht ist das Gehalt, das wir am häufigsten an unsere Mitarbeiter auszahlen.*/
SELECT top 1 with ties count(gehalt) AS Anzahl, gehalt
FROM mitarbeiter
GROUP BY gehalt
ORDER BY count(gehalt) DESC

/*9. Gesucht sind das minimale und das maximale Gehalt, das durchschnittliche Gehalt und die Summe aller Gehälter. */
SELECT min(gehalt) AS Minimum, max(gehalt) AS Maximum, avg(gehalt) AS Durchschnitt, sum(gehalt) AS Summe
FROM mitarbeiter




/*10. Ermitteln Sie die Differenz zwischen dem höchsten und dem niedrigsten Gehalt mit einer SQL-Anweisung. Nennen Sie die Spalte „Differenz“.*/
SELECT max(gehalt) - min(gehalt) AS Differenz
FROM mitarbeiter

/*1. Bestimmen Sie die Summe der Gehälter der einzelnen Abteilungen. In der Anzeige sollen nur diejenigen erscheinen, deren Summe größer als 10000 ist*/
SELECT bezeichnung, sum(gehalt) AS Summe
FROM mitarbeiter m, abteilung a
WHERE m.abtid = a.abtid
GROUP BY bezeichnung
HAVING sum(gehalt) > 10000



/*2. Sie suchen die Summe aller Gehälter unserer noch bei uns arbeitenden Mitarbeiter, abhängig von der Abteilung, in der sie arbeiten. Angezeigt werden sollen die, die größer als 4000 sind.*/
SELECT bezeichnung, sum(gehalt) AS Summe
FROM mitarbeiter m, abteilung a
WHERE m.abtid = a.abtid AND austrittsdatum IS NULL
GROUP BY bezeichnung
HAVING sum(gehalt) > 4000



/*3. Wie oft haben unsere Mitarbeiter aus welchen Gründen das Unternehmen verlassen? Uns interessieren nur die Gründe, die mehr als 3x angegeben wurden.*/
SELECT austrittsgrund, count(austrittsgrund) AS Anzahl
FROM mitarbeiter
GROUP BY austrittsgrund
HAVING count(austrittsgrund) > 3

/*4. Wir wollen wissen, wie viele Mitarbeiter in den einzelnen Abteilungen ein Gehalt bekommen, das größer ist als 2000. Angezeigt werden sollen die Abteilungen,*/
/*die mehr als 3 Mitarbeiter dieser Gehaltsklasse haben.*/
SELECT count(name) AS Anzahl, bezeichnung
FROM mitarbeiter m, abteilung a
WHERE m.abtid = a.abtid AND gehalt > 2000
GROUP BY bezeichnung
HAVING count(name) > 3




/*2. Wer hat aus dem gleichen Grund das Unternehmen verlassen wie Herr Lempe?*/
SELECT name, vorname, austrittsgrund
FROM mitarbeiter
WHERE austrittsgrund =
	(
	SELECT austrittsgrund
	FROM mitarbeiter
	WHERE name = 'Lempe'
	)

/*3. Wer verdient weniger als Thomas klein*/
SELECT name, vorname
FROM mitarbeiter
WHERE gehalt <
	(
	SELECT gehalt
	FROM mitarbeiter
	WHERE Name = 'klein' AND vorname = 'Thomas'
	)

/*4. Gesucht sind alle Mitarbeiter mit ihrem Nachnamen und Vornamen, die mehr als das Durchschnittsgehalt verdienen.*/
SELECT name, vorname, gehalt
FROM mitarbeiter
WHERE gehalt >
	(
	SELECT avg(gehalt)
	FROM mitarbeiter
	)




/*5. Erstellen Sie eine Abfrage, die die Personalnummern und Nachnamen aller Mitarbeiter anzeigt, die in einer Abteilung mit einem Mitarbeiter arbeiten, dessen Nachnamen ein „u“*/
/* enthält. IN Befehlt, weil beim LIKE %u% mehrere namen rauskommt, wie z.B IN (2800,3000,3200)*/
SELECT mitarbeiterid, name
FROM mitarbeiter
WHERE abtid IN
	(
	SELECT abtid
	FROM mitarbeiter
	WHERE name LIKE '%u%'
	)
/*6. Wie viele Mitarbeiter arbeiten in der gleichen Abteilung wie Anja Lupin und haben anderes Geschlecht*/
SELECT count(name)
FROM mitarbeiter
WHERE abtid = 
	(
	SELECT abtid 
	FROM mitarbeiter
	WHERE name = 'Lupin' AND vorname = 'Anja'
	)
AND geschlecht !=
	(
	SELECT geschlecht 
	FROM mitarbeiter
	WHERE name = 'Lupin' AND vorname = 'Anja'
	)


/*1. Welcher meiner Freunde (nachname) hat zugeordnete Interessen?*/
SELECT nachname
FROM tl3_manwoman
WHERE mwnr IN
	(
	SELECT mwnr
	FROM tl3_mw_interessen
	)

/*2. Welcher meiner Freunde (nachname) hat keine zugeordneten Interessen?*/
SELECT nachname, vorname
FROM tl3_manwoman
WHERE mwnr NOT IN
	(
	SELECT mwnr
	FROM tl3_mw_interessen mwi
	)




/*3. Welche Interessen (inttext) haben meine Freunde (nachname, vorname), sortiert nach nachname?*/
SELECT inttext, nachname, vorname
FROM tl3_interessen i, tl3_manwoman mw
WHERE mwnr IN 
	(
	SELECT mwnr
	FROM tl3_mw_interessen mwi
	WHERE mwi.intnr = i.intnr
	)
ORDER BY nachname


/*4. Wie viele Interessen (Anzahl) hat Frau Kron*/
SELECT count(mwnr) AS Anzahl
FROM tl3_mw_interessen
WHERE mwnr =
	(
	SELECT mwnr
	FROM tl3_manwoman
	WHERE nachname = 'Kron'
	)

/*5. Welcher meiner Freunde (nachname, vorname) liest gerne?*/
SELECT nachname, vorname
FROM tl3_manwoman mw
WHERE mwnr IN
	(
	SELECT mwnr
	FROM tl3_mw_interessen mwi, tl3_interessen i
	WHERE mwi.intnr = i.intnr AND inttext = 'Lesen'
	)


/* 6. Welcher meiner Freunde (nachname, vorname) hat die gleichen Hobbies wie Lecter? */
SELECT vorname, nachname
FROM tl3_manwoman			
WHERE mwnr in
(
SELECT mwnr
FROM tl3_mw_interessen  
WHERE intnr in
(
SELECT intnr
FROM tl3_mw_interessen  
WHERE mwnr =
(
SELECT mwnr
FROM tl3_manwoman		
WHERE nachname = 'Lecter'
)))



/*1. Alle Datensätze der Tabelle artikel*/
select * 
from artikel 

/*2. Alle Artikelnummern, Verkaufspreise und Bezeichnungen der Tabelle artikel*/
select artnr, vkpreis, bezeichnung 
from artikel

/*3. Alle Tupel aus der Tabelle lieferanten*/
select * 
from lieferanten

/*4. Alle Firmenbezeichnungen samt PLZ und Ort*/
select Firma1, Plz, Ort
from lieferanten

/*5. Erzeugen Sie die gleiche Ausgabe wir zuvor, dieses Mal aber mit Spaltenaliasen:
firma1 wird zu Unternehmen, Ort wird zu Niederlassung*/
select firma1 as Unternehmen , Plz, ort as Niederlassung
from lieferanten

/*6. Welche Artikelgruppen enthält Ihre Tabelle und wie viele Artikel sind jeweils zugeordnet?
Gesucht sind:*/
select ag.artgr, count(a.artnr) as anzahl
from ARTIKELGRUPPEN ag join ARTIKEL a on ag.ARTGR=a.GRUPPE
group by ag.ARTGR

/*7. Anrede, Vorname, Nachname (Tabelle Personal)*/
select text as Anrede, vorname, nachname
from personal p join anreden a on a.ANRNR=p.GESCHLECHT

/*8. Anrede, Vorname, Nachname, Abteilungsnummer, Bezeichnung der Abteilung*/
select anreden.text as Anrede, p.vorname, p.nachname, a.abtnr, a.text as Abteilung
from personal p join ABTEILUNGEN a on a.ABTNR=p.ABTLG
join anreden on anreden.ANRNR=p.GESCHLECHT

/*9. Anrede, Vorname, Nachname, Abteilungsnummer, Bezeichnung der Abteilung
der Mitarbeiter, die in einer Abteilung mit der Abtnr EK oder VK arbeiten*/
select anreden.text as Anrede, vorname, nachname, abtnr, a.text as Abteilung
from ABTEILUNGEN a join PERSONAL p on a.ABTNR=p.ABTLG join anreden on anreden.ANRNR=p.GESCHLECHT
where ABTLG='EK' or ABTLG='VK'



/*10. Anrede, Vorname, Nachname, Abteilungsnummer, Bezeichnung der Abteilung
der Mitarbeiter, die in der gleichen Abteilung arbeiten wie Herr Meier (oder heißt er Geier oder 
Reiher?)*/
select anreden.text as Anrede, vorname, nachname, abtnr, a.text as Abteilung
from ABTEILUNGEN a join PERSONAL p on a.ABTNR=p.ABTLG join anreden on anreden.ANRNR=p.GESCHLECHT
where ABTLG=
(
select ABTLG
from personal
where nachname like 'meier' or nachname like 'geier' or nachname like 'reiher'
)


/*11. Ich brauche dringen den Firmennamen und die Telefonnummer der Firma die
mir Knickhalme liefern kann?*/
select firma1, tel, BEZEICHNUNG
from LIEFERANTEN l join ARTIKEL a on l.LIEFNR=a.LIEF
where bezeichnung like '%knickhalme%'

/* 12. Alle Mitarbeiter unter 55, die einen Akademischen Grad haben. ( Sternchenaufgabe)
Tipp: and DATEDIFF(yyyy, Gebdatum, GETDATE())<55 */
select nachname, vorname
from personal
where DATEDIFF(YYYY, GEBDATUM, GETDATE()) < 55 and AKADGRAD is not null


/* 1. In welchen Abteilungen (die genaue Bezeichnung, nicht die Abkürzung) arbeiten unsere 
Mitarbeiter, die in Fürth wohnen?
Sie kennen zwei Wege mittels einer Abfrage das gewünschte ausgeben zu lassen. */
select a.text AS Bezeichnung, NACHNAME, VORNAME
from ABTEILUNGEN a join PERSONAL p on a.ABTNR=p.ABTLG
where ORT = 'Fürth'

/* 2. Nennen Sie die Namen und die Vornamen aller Mitarbeiter, deren Personalnummer 
nicht kleiner als 953 ist. Lassen Sie zur Kontrolle die Personalnummer ebenfalls 
ausgeben. */
select p.NACHNAME, p.VORNAME, p.PERSNR
from PERSONAL p
where p.PERSNR !< 953 

/* 3. Sie haben selbstverständlich alle Bestellungen samt Bestellpositionen 
persistent gespeichert. Manche (ggf. auch alle) Bestellungen umfassten mehrere 
Bestellpositionen. Nun stellt sich die Frage, welcher Lieferant (Firma1) hat mit welcher 
Bestellnummer welchen Umsatz erzielt. Sie benötigen hierbei sum(irgendetwas). */
select l.liefnr, l.FIRMA1, sum(b.preis) AS Summe
from LIEFERANTEN l join bestellpositionen b on l.liefnr=b.bestnr
group by l.liefnr, l.FIRMA1




/* 4. Sortieren Sie die Ausgabe bitte nach Rechnungspreis, so dass der höchste Betrag als 
erstes erscheint. Tipp: Tabelle bestellungen wird benötigt. Hier ohne Berücksichtigung 
des Rabatts */
select l.FIRMA1, b.BESTNR, sum(bp.PREIS) AS Rechnungspreis
from LIEFERANTEN l join BESTELLUNGEN b on l.LIEFNR=b.LIEFERANT
join BESTELLPOSITIONEN bp on bp.BESTNR=b.BESTNR
group by l.FIRMA1, b.BESTNR
order by sum(bp.PREIS)

/* 5. Gesucht werden Nachname, Abteilungsnummer und –bezeichnung der Personen die weder im 
Controlling, noch im Marketing tätig sind. */
select p.NACHNAME, p.ABTLG AS Abteilungsnummer, a.TEXT AS Bezeichnung
from PERSONAL p join ABTEILUNGEN a on p.ABTLG=a.ABTNR
where a.TEXT != 'Controlling' and a.TEXT != 'Marketing'

/* 6. Gesucht werden Personalnummer, Nachname und Vorname der Mitarbeiter, die keine einzige 
Bestellungen bearbeitet haben. */
select p.PERSNR, p.NACHNAME, p.VORNAME
from PERSONAL p join BESTELLUNGEN b on p.PERSNR=b.BEARBEITER
where p.PERSNR not in
(
select b.BEARBEITER
from BESTELLUNGEN
)

/* 7. Welche Lieferanten (Nummer und Firmenbezeichnung) haben wie viele Artikel geliefert? */
select l.LIEFNR, l.FIRMA1, count(lief) AS Anzahl
from LIEFERANTEN l join ARTIKEL a on l.LIEFNR=a.LIEF
group by l.LIEFNR, l.FIRMA1

/* 8. Finden Sie alle Mitarbeiter (Personalnummer, Nachname), deren Mitarbeiternummer weder 455, 
noch 755 oder 999 ist. Sortieren Sie nach Personalnummer aufsteigend. */
select p.PERSNR, p.NACHNAME
from PERSONAL p
where p.PERSNR not in (455,755,999)
order by p.PERSNR

/* 9. Nennen Sie die Mitarbeiternummer aller Mitarbeiter, bei denen eine Strasse eingegeben wurde 
und die nicht am Kneipenwall wohnen. */
select p.PERSNR AS Mitarbeiternummer
from PERSONAL p
where p.STRASSE is not null and p.STRASSE not like '%Kneipenwall%'

/* 10. Wie viele Mitarbeiter arbeiten in den jeweiligen Abteilungen? */
select count(p.PERSNR) as anzahl, a.TEXT as Abteilung
from PERSONAL p join ABTEILUNGEN a on p.ABTLG=a.ABTNR
group by a.TEXT

/* 11. Welche Mitarbeiter haben einen akademischen Grad (und welchen)? */
select p.NACHNAME, p.AKADGRAD 
from PERSONAL p
where p.AKADGRAD is not null





/* 1. Erstellen Sie eine View namens 'v_personalSozGeh' die es dem Anwender erlaubt folgende 
Einträge zu sehen:
Personalnummer, Sozialversicherungsnummer, Gehalt */
create view v_personalSozGeh(Personalnummer, Sozialversicherungsnummer, Gehalt)
as
select persnr, sozversnr, gehalt from PERSONAL

/* 2. Fragen Sie mit select * alles gegen die view ab */ 
select * from v_personalSozGeh

/* 3. Ändern Sie in der Tabelle Personal das Gehalt der Person mit der Personalnummer 952 von 
1100 auf 11000 */
update personal 
set gehalt=11000 where persnr=952

/* 4. Fragen Sie mit select * alles gegen die view v_personalSozGeh ab */
select * 
from v_personalSozGeh

/* 5. Na das war wohl ein Tippfehler. Ändern Sie in der view das Gehalt zurück zu 1100 */
update v_personalSozGeh
set gehalt=1100 where personalnummer=952

/* 6. Fragen Sie das Gehalt der Person mit der persnr 952 gegen die Personaltabelle ab */
select persnr, gehalt
from PERSONAL
where persnr=952

/* 7. Erstellen Sie schnell eine Tabelle TestL1 mit folgenden Einträgen: */
create table testL1 (nname varchar(20))
insert into testL1 values ('Meier'),('Mueller'),('Huber')

/*8. Erstellen Sie eine View v_TestL1 von oben genannter Tabelle */
create view v_TestL1
as
(
select * from testL1
)

/*9. Kontrollieren Sie sowohl den Inhalt der Tabelle, als auch den der View */
select * from testL1
select * from v_TestL1

/*10. Löschen Sie den Inhalt der view. Was passiert mit der Tabelle */
delete from v_TestL1

/*11. Kontrollieren Sie sowohl den Inhalt der Tabelle, als auch den der View */
select * from testL1
select * from v_TestL1


/*12. Füllen Sie die Tabelle testL1 erneut */
insert into testL1 values ('Mueller'), ('Meier'), ('Huber')

/*13. Kontrollieren Sie die view v_testL1 */
select * from v_TestL1

/*14. Droppen Sie die view */
drop view v_TestL1


/*15. Kontrollieren Sie die Tabelle und die View
Welche 'von beiden' ist noch da? Eine, keine, beide? */
select* from v_testL1
select * from testL1





/* 1. Bitte erstellen Sie eine Tabelle Superhelden. Diese soll eine automatisch 
generierte fortlaufende Nummer, beginnend bei 1 in der Schrittweite 2 erhalten. 
Weitere Attribute sind Superheldenname (SName) und Realname (RName). */
create table Superhelden (Nr integer identity(1,2), SName varchar(30), RName varchar(30))
select * from Superhelden

/* 2. Fügen Sie folgende drei Superhelden ein:
Batman: Bruce Wayne, Captain America: Steven Rogers, Catgirly: Selina Kyle */
insert into Superhelden values ('Batman','Bruce Wayne'), ('Captain America','Steven Rogers'), ('Catgirly','Selina Kyle')


/* 3. Selina ist erwachsen geworden, nennen wir sie nun Catwoman */
update Superhelden 
set SName='Catwoman' where SName='Catgirly'

/* 4. Ich persönlich finde Captain America ja zu glatt, 'killen' wir ihn */
delete from Superhelden where SName='Captain America'

/* 5. Erstellen Sie nun bitte eine Kopie der Tabelle (superhelden zu SuppisSich) */
select * into SuppisSich from superhelden

/* 6. Löschen Sie den Inhalt der Tabelle superhelden */
delete from superhelden

/* 7. Vernichten (droppen) Sie nun die Tabelle superhelden */
drop table superhelden

/* 8. Das war ne blöde Idee mit der SuppisSich-Tabelle, benennen Sie sie doch bitte um 
zu Superhelden */
sp_rename 'SuppisSich','Superhelden'
select * from superhelden

/* 9. Fügen Sie bitte eine Spalte geschlecht (char(10))hinzu */
alter table superhelden add Geschlecht char(10)

/* 10. Ach verd…, es sollte char(1) sein. Ändern Sie das bitte */
alter table superhelden alter column Geschlecht char(1)

/* 11. Geschlecht ist ein langes Wort, geschl reicht auch. Ändern Sie bitte das Attribut
zu geschl */
sp_rename 'superhelden.Geschlecht', 'geschl'
select * from superhelden

/* 12. Fügen Sie bitte eine Spalte Lebensalter hinzu */
alter table superhelden add Lebensalter char(3)

/* 13. Sorry, das ist nicht mein Tag. Löschen Sie die Spalte bitte wieder */
alter table superhelden drop column Lebensalter



/* 14. Achtu lieber Himmel, wir haben ja den PK vergessen. Machen Sie bitte die Nummer 
zum PK */
alter table superhelden
add primary key (Nr)

/* 15. Erstellen Sie bitte eine Tabelle geschlecht (1 - weiblich, 2 - männlich, 3- tierisch)*/
create table geschlecht (g_id int, geschlecht char(1))
insert into geschlecht values (1,'w'), (2,'m'), (3,'t')
select * from geschlecht


/* 16. Wir wollen die g_id zum PK machen (Achtung, die Spalte darf keine null-Werte enthalten)*/
alter table geschlecht alter column g_id int not null

/* 17. Und nun den PK festnageln */
alter table geschlecht add primary key (g_id)

/* 18. Und wieder habe ich nicht aufgepasst. In Superhelden ist geschl ein char in 
geschlecht ein int */
alter table superhelden alter column geschl int



/* 19. Ändern wir das. In Superhelden soll geschl nun auch vom Datentyp int sein */
alter table superhelden alter column geschl int 

/* 20. Fehlt noch der Foreign Key von Superhelden zu geschlecht */
alter table superhelden add foreign key (geschl) references geschlecht(g_id)




/* 21. Aktualisieren Sie nun bitte die superhelden um die Geschlechteinträge */
update superhelden set geschl=1 where SName='Catwoman';
update superhelden set geschl=2 where Sname='Batman'
/* 22. Fügen Sie bitte einen tierischen Held hinzu */
insert into superhelden values ('Ant-Man', 'Henry-Pym',3)

/* Lassen Sie bitte nun alle Superhelden anzeigen: Superheldenname, Realname und das 
ausgeschriebene Geschlecht
Hat alles geklappt? Feiern Sie sich !! */
select Sname, RName,geschlecht
from superhelden join geschlecht on geschl=g_id


/* Übung 9 */

/* 1. Wer will sich denn da bei mir einnisten? */
select nachname, vorname, email
from tl3_manwoman
where email='hunger@braini.de'

/* 2. Welche meiner Freunde (Nachname, Vorname) lesen gerne? Geben Sie zudem den inttext aus,
um das Ergebnis überprüfen zu können. Nutzen Sie einen Subselect */
select mw.nachname, mw.vorname, i.inttext
from tl3_manwoman mw join tl3_mw_interessen mwi on mw.mwnr=mwi.mwnr
join tl3_interessen i on mwi.intnr=i.intnr
where inttext =
(
select inttext
from tl3_interessen
where inttext = 'lesen'
)

--3. Wer ist mein ältester Freund (Lebensalter)? Hinweis: Hier reicht das min auf gebdatum.
select top 1 nachname, vorname, min(gebdatum)
from tl3_manwoman
group by nachname, vorname
order by min(gebdatum)

--4. Erstellen Sie eine Kopie der drei tl3 Tabellen
• tl3_manwoman → manwoman.
• tl3_mw_interessen → mw_interessen.
• tl3_interessen wird → hobbies.

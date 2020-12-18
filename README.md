# projet_web
Projet web URBINO ENNASRI

Explication du fonctionnement du site "Ubriso Sondage":

C'est un site qui permet d'afficher des sondages basés sur des propositions de dates et d'heures. Plusieurs fonctionnalités sont présentes dans le site comme par exemple la possibilité de crééer des nouveaux sondages ou de supprimer des sondages existants. Afin d'accéder au site, il est necessaire de s'authentifier. Enfin, si l'utilisateur ne possède pas de compte, il lui est possible de s'inscrire.

1.Partie Login

Cette partie concerne la connexion de l'utilisateur.
Pour se connecter, l'utilisateur doit rentrer son adresse mail ainsi que son mot de passe et cliquer sur connexion.
Enfin, un bouton d'inscription est disponible afin de s'inscrire.
![authentification](https://user-images.githubusercontent.com/66034298/102663029-4d187580-4180-11eb-90bf-86fc415b870b.PNG)

Dans la partie inscripiton, il y a également un bouton "revenir à la page précédente disponible" afin de revenir à la page d'authentification.
![inscription](https://user-images.githubusercontent.com/66034298/102663052-5acdfb00-4180-11eb-8884-1e090df91f45.PNG)

2.Partie sondage

Une fois connecté, une page d'acceuil de sondage s'affiche. Dans cette page, nousretrouvons plusieurs fonctionnalités et boutons. Tout d'abord,à gauche, il y a le bouton "créer un nouveau sondage" qui permet d'ajouter à la liste un nouveau sondage.
Ensuite, il y à la liste de tous les sondages existants récapitulant toutes les propositions possibles ainsi qu'un bouton "supprimer" en bleu qui permet de supprimer le sondage en question.
Enfin, tout en haut à gauche, il y a le bouton deconnexion qui nous permet de revenir directement à la page d'authentification.
<img width="948" alt="sondage1" src="https://user-images.githubusercontent.com/66034298/102663344-f7909880-4180-11eb-9728-b5a62396f8f0.PNG">
<img width="947" alt="sondage2" src="https://user-images.githubusercontent.com/66034298/102663351-fb241f80-4180-11eb-8c65-96da8071c77d.PNG">

Après avoir clické sur le bouton "créer un nouveau sondage, nous avons accès à une nouvelle page dédiée à la création d'un sondage.
Il y a 6 champs à remplir: 3 propisitions de dates + 3 propositions de lieu.
Pour confirmer la création du sondage, il faut clicker sur le bouton "créer ce sondage". 
Enfin un bouton de retour en arrière est égelement disponible afin de revenir à la page d'accueil des sondages.
Une fois un sondage créé, il sera directement ajouté à la liste des sondages dans la page d'accueil.
![sondage3](https://user-images.githubusercontent.com/66034298/102663359-feb7a680-4180-11eb-8d8f-31e8a94914ad.PNG)

Les utilisateurs ainsi que les sondages sont stockés dans une base de données SQL.
Voici les requêtes qui permettent de créer les tables et donc de pouvoir les tester.

CREATE DATABASE projetweb ;

CREATE TABLE `projetweb`.`users` (
  `id_users` INT NOT NULL AUTO_INCREMENT,
  `mail` VARCHAR(45) NULL,
  `password` VARCHAR(45) NULL,
  `nom` VARCHAR(45) NULL,
  `prenom` VARCHAR(45) NULL,
  PRIMARY KEY (`idUsers`));
  
  INSERT INTO users (id_users,mail,password,nom,prenom) values (1,'urbino@et.esiea.fr','user','urbino','julian');
  
  CREATE TABLE `projetweb`.`sondages` (
  `idsondages` INT NOT NULL AUTO_INCREMENT,
  `userid` INT NULL,
  `lieu1` VARCHAR(45) NULL,
  `lieu2` VARCHAR(45) NULL,
  `lieu3` VARCHAR(45) NULL,
  `date1` DATE NULL,
  `date2` DATE NULL,
  `date3` DATE NULL,
  PRIMARY KEY (`idsondages`),
  INDEX `FK_userid_idx` (`userid` ASC) VISIBLE,
  CONSTRAINT `FK_userid`
    FOREIGN KEY (`userid`)
    REFERENCES `projetweb`.`users` (`idUsers`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);

  INSERT INTO sondages (idsondages,userid,lieu1,lieu2,lieu3,date1, date2, date3) values (1,1,'yerres','brunoy','VSG','2021-02-01', '2021-03-01', '2021-04-01');
  INSERT INTO sondages (idsondages,userid,lieu1,lieu2,lieu3,date1, date2, date3) values (2,1,'osny','stains','gonesse','2021-02-02', '2021-02-02', '2021-02-03');
  INSERT INTO sondages (idsondages,userid,lieu1,lieu2,lieu3,date1, date2, date3) values (3,1,'rosny','mtgr','neuilly','2021-04-01', '2021-06-01', '2021-09-01');


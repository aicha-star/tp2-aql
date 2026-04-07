Tests d’intégration avec JUnit et Mockito
Exercice 1 : Interaction simple entre modules
Vérifications effectuées
Le service retourne le bon utilisateur
La méthode findUserById() est appelée avec le bon paramètre


**************************************
Exercice 2 : Interaction Controller → Service → DAO
Vérifications effectuées:
OrderController appelle correctement OrderService
OrderService appelle correctement OrderDao
********************************************

Exercice 3 : Intégration avec une API externe
Vérifications effectuées:
L’API est appelée avec le bon paramètre
Le service retourne les données correctement
Les erreurs sont bien gérées
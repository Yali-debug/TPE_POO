# Exercice 12
// corrigé proposé par Tsague Louidivine Cardie 

#1. La méthode boolean contains(Rectangle) doit-elle être redéfinie dans SlantedRectangle ?
Oui, elle doit être redéfinie.
justification: Parce que le comportement de la méthode contains(Rectangle r) pour un rectangle incliné (classe SlantedRectangle) ne peut pas être identique à celui d’un rectangle classique (Rectangle) : Il faut prendre en compte l’inclinaison, Les calculs de position et d’intersection sont différents (projection des points, rotation inverse, etc.).
 Redéfinir cette méthode dans SlantedRectangle permet d’adapter le comportement à la géométrie inclinée.


#2. Quels cas ne sont pas couverts par cette redéfinition ?
La redéfinition de contains(Rectangle r) dans SlantedRectangle ne couvre que les cas où l’objet passé en paramètre est vu comme un Rectangle, donc :
- Si on passe un objet SlantedRectangle typé comme Rectangle, c’est la méthode contains(Rectangle) qui est appelée,

- Et pas la version plus spécifique contains(SlantedRectangle) (si elle existe), car Java ne fait pas de dispatch dynamique sur les types de paramètres 

#3. On ajoute boolean contains(SlantedRectangle) dans Rectangle et SlantedRectangle.
Cela améliore les choses, mais ne couvre toujours pas tous les cas.

* Cas couverts :
Si l'on  appele explicitement r.contains(s) où :
- r est un Rectangle
- s est un SlantedRectangle
Alors c’est la surcharge contains(SlantedRectangle) qui est appelée.

*  Cas non couverts :
- Si s est typé comme Rectangle, même s’il contient en réalité un SlantedRectangle, et que vous appelez r.contains(s), alors :
		La méthode appelée sera contains(Rectangle), pas contains(SlantedRectangle).


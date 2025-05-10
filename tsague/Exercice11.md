
#Exercice 11
ici, on cherche à vérifier les relations d'héritage entre les objets et les classes à l'aide de l'opérateur instanceof. Cet opérateur est utilisé pour tester si un objet est une instance d'une certaine classe ou d'une de ses sous-classes.



        System.out.println(a instanceof A); 
        System.out.println(ab instanceof A); 
        System.out.println(b instanceof A); 
        System.out.println(a instanceof B); 
        System.out.println(ab instanceof B); 
        System.out.println(b instanceof B); 


Le resultat affiché est donc: 
		true 
		true 
		true
		false
		true 
		true
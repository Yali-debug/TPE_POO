# TPE_POO
Héritage, Masquage de méthode sur JAVA

On considère des rectangles donc les côtés ne sont plus nécessairement parallèles aux axes. 
Un tel rectangle est vu comme un rectangle aux côtés parallèles qui aurait été incliné d'un 
certain angle par rapport à l'horizontale. 

Exercice n° 1 
En utilisant l'héritage, définir une classe SlantedRectangle permettant de manipuler de tels 
objets. Définir des constructeurs appropriés. 

Exercice n° 2 
Définir une méthode rotate dans l'esprit de la méthode translate.  

Exercice n° 3 
De quelles méthodes hérite la classe SlantedRectangle ? Redéfinir celles qui le nécessitent.

Exercice n° 4 
Pour chacun des appels de méthode ci-dessous, dire s'il va être compilé correctement et 
auquel cas, quelle méthode est appelée effectivement à l'exécution ?  
    Point p = new Point(1,2); 
    Rectangle r = new Rectangle(p, 2, 3); 
    Rectangle t = new SlantedRectangle(p, 2, 3); 
    SlantedRectangle s = new SlantedRectangle(p, 2, 3); 
    System.out.println(r.surface()); 
    r.rotate(2); println(r.contains(p)); 
    System.out.println(t.surface()); 
    t.rotate(2); 
    System.out.println(t.contains(p)); 
    System.out.println(s.surface()); 
    s.rotate(2); 
    System.out.println(s.contains(p)); 


Exercice n° 5 
Est-ce que la classe Dessin définie précédemment peut contenir des rectangle inclinés ? Est
ce que les méthodes surface, contains et hull de la classe Dessin fonctionnent encore 
correctement ?  

Exercice n° 6 
Définir une méthode String toString() dans la classe Rectangle ? Est-ce en fait une 
définition ou une redéfinition ? Est-il nécessaire de la redéfinir dans la classe 
SlantedRectangle ?  
Exercice n° 7 

Redéfinir la méthode equals dans les classes Rectangle et SlantedRectangle.  
On considère les définitions de classes suivantes  
    class A { 
    void f(A o) { 
    System.out.println("void f(A o) dans A"); 
    } 
} 
    class B extends A { 
    void f(A o) { 
    System.out.println("void f(A o) dans B"); 
    } 
} 

Exercice n° 8 
Qu'affiche le fragment de programme suivant ?  
    A a = new A(); 
    A ab = new B(); 
    B b = new B(); 
    a.f(a); 
    a.f(ab); 
    a.f(b); 
    ab.f(a); 
    ab.f(ab); 
    ab.f(b); 
    b.f(a); 
    b.f(ab); 
    b.f(b); 
    Exercice n° 9 
    On ajoute maintenant à la classe B la méthode suivante  
    void f(B o) { 
    System.out.println("void f(B o) dans B"); 
 } 
Est-ce une redéfinition ou une surcharge ? Qu'affiche alors le fragment de programme de 
l'exercice 8 ?

Exercice n° 10 
On ajoute finalement à la classe A la méthode suivante  
    void f(B o) { 
    System.out.println("void f(B o) dans A"); 
    } 
    Est-ce une redéfinition ou une surcharge ? Qu'affiche alors le fragment de programme de 
    l'exercice 8 ?  
    Exercice n° 11 
    Qu'affiche le fragment de programme suivant ?  
    System.out.println(a instanceof A); 
    System.out.println(ab instanceof A); 
    System.out.println(b instanceof A); 
    System.out.println(a instanceof B); 
    System.out.println(ab instanceof B); 
    System.out.println(b instanceof B); 

Exercice n° 12 
Dans la classe Rectangle a été définie une méthode boolean contains(Rectangle). Cette 
méthode doit-elle être redéfinie dans la classe SlantedRectangle ? Quels cas ne sont pas 
couverts par cette redéfinition ? On ajoute alors une méthode boolean 
contains(SlantedRectangle) dans les classes Rectangle et SlantedRectangle. Quels 
cas ne sont toujours pas couverts par ces ajouts ?

Exercice n° 13 
On considère les définitions de classes suivantes  
    class C { 
    char ch = 'C'; 
    char getCh() { return ch; } 
    } 
    class D extends C { 
    char ch = 'D'; 
    char getCh() { return ch; } 
    } 
    Qu'affiche le fragment de programme suivant ?  
    C c = new C(); 
    C cd = new D(); 
    D d = new D(); 
    System.out.println(c.ch); 
    System.out.println(c.getCh()); 
    System.out.println(cd.ch); 
    System.out.println(cd.getCh()); 
    System.out.println(d.ch); 
    System.out.println(d.getCh());
